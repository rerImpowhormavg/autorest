# build task for tsc 
task 'build', 'build:typescript', (done)-> 
  count = 0
  typescriptProjects()
    .pipe foreach (each,next) -> 
      count++
      execute "#{basefolder}/node_modules/.bin/tsc --project #{folder each.path}", (code,stdout,stderr) ->
        echo stdout.replace("src/next-gen","#{basefolder}/src/next-gen") 
        count--
        if count is 0
          done() 

      next null
    return null

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

task 'install', 'install:typescript', (done)-> 
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
    

