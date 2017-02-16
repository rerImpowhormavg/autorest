
fs = require('fs')

concurrency = 0 
queue = []


module.exports =
  # lets us just handle each item in a stream easily.
  foreach: (delegate) -> 
    through.obj ( each, enc, done ) -> 
      delegate each, done

  toArray: (result,passthru) => 
    foreach (each,done) => 
      result.push(each)
      if passthru 
        done null, each
      else
        done null

  showFiles: () ->
    foreach (each,done) ->
      echo info each.path
      done null, each

  onlyFiles: () -> 
    foreach (each,done) ->
      return done null, each if fs.statSync(each.path).isFile()
      done null

  source: (globs, options ) -> 
    gulp.src( globs, options) 

  destination: (globs, options ) -> 
    gulp.dest( globs, options) 

  task: (name, description, deps, fn) ->
    throw "Invalid task name " if typeof name isnt 'string' 
    throw "Invalid task description #{name} " if typeof description isnt 'string' 

    if typeof deps == 'function'
      fn = deps
      deps = []

    # chain the task if it's a repeat
    if name of gulp.tasks
      prev = gulp.tasks[name]

      # reset the name of this task to be a 'child'' task
      name = "#{name}/#{description}"
      description = ''

      # add this task as a dependency of the original task.
      prev.dep.unshift name
    
    # add the new task.
    gulp.task name, deps, fn
    
    # set the description
    gulp.tasks[name].description = description

    return

  where: (predicate) -> 
    foreach (each,done) ->
      #return done null if each?
      return done null, each if predicate each 
      done null

  splitPath: (path) ->
    s = path.match /^(.+)[\\\/]([^\/]+)$/  or [path, '',path]
    f = s[2].match(/^(.*)([\\.].*)$/ ) or [s[2],s[2],'']
    d = (path.match /^(.:)[\\\/]?(.*)$/ ) or ['','',path]
    return {
      fullname : path
      folder : s[1]
      filename : s[2]
      basename : f[1]
      extension : f[2]
      drive:  d[1] or ''
      folders: (d[2].split /[\\\/]/ )or path
    }

  folder: (path) ->
    return '' if not path 
    return (splitPath path).folder

  split: (path) ->
    return '' if not path 
    return (splitPath path).folders

  filename: (path) ->
    return '' if not path 
    p = splitPath path
    return p.filename

  extension: (path) ->
    return '' if not path 
    p = splitPath path
    return p.extension

  basename: (path) ->
    return '' if not path 
    p = splitPath path
    return p.basename

  exists: (path) ->
    return test '-f', path 

  newer: (first,second) ->
    f = fs.statSync(first).mtime
    s = fs.statSync(second).mtime
    return f > s 

  flattenEncode: (path) ->
    path.basename = "#{ path.dirname.replace(/[\/\\]/g, '_') }_#{path.basename}" 
    path.dirname = ""

  flattenDecode: (path) ->
    f = path.basename.match(/^(.*)_(.*)$/ )
    path.basename = "#{f[1].replace(/[_]/g, '/') }/#{f[2]}"
    path.dirname = ""

  except: (match) -> 
    foreach (each,done) ->
      return done null if each.path.match( match ) 
      done null, each

  guid: ->
    x = -> Math.floor((1 + Math.random()) * 0x10000).toString(16).substring 1
    "#{x()}#{x()}-#{x()}-#{x()}-#{x()}-#{x()}#{x()}#{x()}"

  Fail: (text) ->
    echo ""
    echo "#{ error 'Task Failed:' }  #{error_message text}"
    echo ""
    rm '-rf', "#{process.env.tmp}/gulp"
    process.exit(1)
  

  execute: (cmdline,options,callback)->
    if typeof options == 'function' 
      callback = options
      options = { }

    # if we're busy, schedule again...
    if concurrency >= threshold
      queue.push(->
          execute cmdline, options, callback
      )
      return
  
    concurrency++

    options.cwd = options.cwd or basefolder 
    echo  "           #{quiet_info options.cwd} :: #{info cmdline}" if !options.silent 
    
    options.silent = !verbose 

    exec cmdline, options, (code,stdout,stderr)-> 
      concurrency--

      if code and (options.retry or 0) > 0
        echo warning "reytrying #{options.retry} #{cmdline}"
        options.retry--
        return execute cmdline,options,callback

      # run the next one in the queue
      if queue.length
        fn = (queue.shift())
        fn() 

      if code 
        echo error "#{options.cwd}"
        echo error "#{cmdline}"
        echo warning stderr
        echo error stdout

        Fail "Task failed, fast exit"
      callback(code,stdout,stderr)

# build task for global build
module.exports.task 'build', 'builds project', -> 
  echo "Building project in #{basefolder}"

# task for vscode
module.exports.task 'code', 'launches vscode', -> 
  exec "code #{basefolder}"

module.exports.task 'release-only', '', (done)-> 
  Fail( "This command requires --configuration release" ) if configuration isnt "release"
  done()
 