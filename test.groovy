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
               sh "ls -la"
               sh "docker run -it -p 127.0.0.1:8080:8080 -p 127.0.0.1:9090:9090 -e TZ=Europe/Amsterdam webgoat/webgoat"
	    }
	    
    	
    	
    	}
    }
    
}    
