pipeline {
    agent any
    deleteDir()
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
    
    }
    
}    
