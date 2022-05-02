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
	    }
	sh "ls -la"
	    
    	
    	
    	}
    }
    
}    
