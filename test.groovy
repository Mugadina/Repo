pipeline {
    agent any
    stages {
    	stage ("test") {
	    steps{
	    	git(
            	   branch: "master",
            	   credentialsId: "github",
            	   url: "https://github.com/Mugadina/Repo.git"
               )
	    }
    	}	
    
    	stage ("Download Repo") {
	    steps{
	    	git(
            	   branch: "develop",
            	   credentialsId: "github",
            	   url: "https://github.com/WebGoat/WebGoat.git"
               )
               //sh "ls -la"
               sh "wget https://github.com/WebGoat/WebGoat/releases/download/v8.2.2/webgoat-server-8.2.2.jar"
               sh "ls -la"
               sh "java -Dfile.encoding=UTF-8 -jar webgoat-8.2.3.jar"
               sh "sudo chmod 700 ./webgoat-8.2.3.jar "
               //sh "sudo rm ./*"
               post {
                  always {
                      cleanWs()
                  }
               }
               //sh "docker run -it -p 127.0.0.1:8080:8080 -p 127.0.0.1:9090:9090 -e TZ=Europe/Amsterdam webgoat/webgoat"
	    }
	    
    	
    	
    	}
    }
    
}    
