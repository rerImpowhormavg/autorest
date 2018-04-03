task 'publish-preview' , 'Publishes the the packages to NPM.',['version-number','build'],  (done)->

  # update core package.json
  package_path = "#{basefolder}/src/autorest-core/package.json"
  package_folder = "#{basefolder}/src/autorest-core"
  package_json = require package_path
  package_json.version = version
  JSON.stringify(package_json,null,'  ').to package_path 

  # publish core package
  await execute "npm publish --unsafe-perm --prefix=#{basefolder} --tag preview",{cwd:package_folder, silent:false }, defer c,o,e 
  echo  "\n\nPublished Core:  #{package_json.name}@#{info package_json.version} (tagged as @preview)\n\n"
  
  # update bootstrapper package.json
  package_path = "#{basefolder}/src/autorest/package.json"
  package_folder = "#{basefolder}/src/autorest"
  package_json = require package_path
  package_json.version = version
  JSON.stringify(package_json,null,'  ').to package_path 

  await execute "npm publish --unsafe-perm --prefix=#{basefolder} --tag preview",{cwd:package_folder, silent:false }, defer c,o,e 
  echo  "\n\nPublished Bootstrapper:  #{package_json.name}@#{info package_json.version} (tagged as @preview)\n\n"
    
  done()
