# tools
csu = "c:/ci-signing/adxsdk/tools/csu/csu.exe"

dotnet = (cmd) ->
  foreach (file, callback) ->
    # check if the file is an actual file. 
    # if it's not, just skip this tool.
    if !file or !file.path
      return callback null, file
    
    # do something with the file
    await execute "dotnet #{cmd} #{ file.path } /nologo", defer code,stdout,stderr
    # Fail "dotnet #{cmd} failed" if code
    # or just done, no more processing
    return callback null

###############################################
# Common Tasks

############################################### 
task 'reset-dotnet-cache', 'removes installed dotnet-packages so restore is clean', ->  
  rm '-rf', "#{os.homedir()}/.nuget"

###############################################
task 'clean','dotnet', (done)-> 
  execute "dotnet clean #{solution} /nologo",(c,s,e) =>
    done()

###############################################
task 'build','dotnet',['restore'], (done) ->
  global.ts_ready++
  execute "dotnet build -c #{configuration} #{solution} /nologo /clp:NoSummary", (code, stdout, stderr) ->
    done()

###############################################
task 'policheck-assemblies','', -> 
  source 'src/**/*.dll'
    .pipe except /install|testapp|tests/ig 
    .pipe policheck()

###############################################
task 'sign-assemblies','', (done) -> 
  # skip signing if we're not doing a release build
  if !(exists csu) 
    echo warning "CODESIGNING is not available."
    echo warning "Binaries will not be code-signed."
    return done()

  Fail "signing requires --configuration release" if configuration isnt "Release"

  unsigned  = "#{workdir}/unsigned"
  mkdir "-p", unsigned 

  signed  = "#{workdir}/signed"
  mkdir "-p", signed

  assemblies() 
    # rename the files to flatten folder names out of the way.
    .pipe rename (path) -> 
      flattenEncode path
    
    # copy the files to the destination before signing 
    .pipe destination(unsigned)

    .on 'end', () =>
      # after the files are in the folder, we can call the signing utility
      codesign "AutoRest",
        "Microsoft Azure .NET SDK"
        unsigned,
        signed,
        () ->
          # after signing, files are in the signed directory
          source "#{signed}/*"
            .pipe rename (path) -> 
              flattenDecode path 
            .pipe destination "#{basefolder}/src"            
            .on 'end', () => 
              # cleanup!
              rm '-rf', workdir
              done()
    
    return;

############################################### 
task 'restore','restores the dotnet packages for the projects', (done) -> 
  if ! test '-d', "#{os.homedir()}/.nuget"
    global.force = true

  projects()
    .pipe where (each) ->  # check for project.assets.json files are up to date  
      return true if force
      assets = "#{folder each.path}/obj/project.assets.json"
      return false if (exists assets) and (newer assets, each.path)
      return true
    .pipe foreach (each,done)->
      execute "dotnet restore #{ each.path } /nologo", {retry:1},(code,stderr,stdout) ->
        done()
  
############################################### 
task 'test-dotnet', 'runs dotnet tests',['restore'] , (done) ->
  # run xunit test in parallel with each other.
  tests()
    .pipe foreach (each,done)->
      execute "dotnet test #{ each.path } /nologo",{retry:1}, (code,stderr,stdout) ->
        done()

global['codesign'] = (description, keywords, input, output, certificate1, certificate2, done)-> 
  done = if done? then done else if certificate2? then certificate2 else if certificate1? then certificate1 else ()->
  certificate1 = if typeof certificate1 is 'number' then certificate1 else 72
  certificate2 = if typeof certificate2 is 'number' then certificate2 else 401

  Fail "Description Required" if not description?
  Fail "Keywords Required" if not keywords?
  Fail "Input Required (folder)" if not input?
  Fail "Output Required (folder)" if  not output?

  execute "#{csu} 
    /c1=#{certificate1}
    /c2=#{certificate2}
    \"/d=#{description}\"
    \"/kw=#{keywords}\"
    \"/i=#{input}\"
    \"/o=#{output}\"
    \"/clean=False\"
  " , (code, stdout, stderr) ->
    Fail error "Code Signing Failed." if code
    echo "done codesigning"
    done();

# the dotnet gulp-plugin.
module.exports = dotnet