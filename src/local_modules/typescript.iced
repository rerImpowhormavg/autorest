# build task for tsc 
task 'build', 'typescript', (done)-> 
  count = 0
  typescriptProjects()
    .pipe foreach (each,next) -> 
      count++
      execute "#{basefolder}/node_modules/.bin/tsc --project #{folder each.path}", (code,stdout,stderr) ->
        echo stdout.replace("src/","#{basefolder}/src/".trim()) 
        count--
        if count is 0
          install_package "#{basefolder}/src/autorest", "src/core/AutoRest/bin/#{configuration}/netcoreapp1.0",done

      next null
    return null

task 'fix-line-endings', 'typescript', ->
  typescriptFiles()
    .pipe eol {eolc: 'LF', encoding:'utf8'}
    .pipe destination 'src'
    #.pipe showFiles()

Import
  install_package: (from,to,done)->
    return setTimeout (->
      install_package from, to, done
    ), 500 if global.ts_ready > 0
   
    Fail "Directory '#{from}' doesn't exist'" if !test "-d", from
    mkdir '-p', to if !test "-d", to

    # create an empty package.json
    "{ }" .to "#{to}/package.json"

    # install the autorest typescript code into the target folder
    execute "npm install #{from}", {cwd : to }, (c,o,e)->
      done();

task 'clean' , 'typescript', (done)->
  generatedFiles()
    .pipe foreach (each,next)->
      rm each.path
      next null

task 'test', 'typescript',['build/typescript'], (done)->
  typescriptProjectFolders()
    .pipe foreach (each,next)->
      execute "#{each.path}/node_modules/.bin/mocha test", {cwd: each.path}, (c,o,e) ->
        next null

task 'npm-install', 'typescript', (done)-> 
  count = 0
  typescriptProjects()
    .pipe foreach (each,next) -> 
      count++
      execute "npm install", {cwd: folder each.path}, (code,stdout,stderr) ->
        count--
        if count is 0
          done() 
      next null

    return null
