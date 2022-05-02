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
    
    }
    
}    
