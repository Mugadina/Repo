pipeline {
    agent any
    stages {
    	stage ("Downloan myRepo") {
	    steps{
	    	git(
            	   branch: "master",
            	   credentialsId: "github",
            	   url: "https://github.com/Mugadina/Repo.git"
               )
	    }
    	}	
    	stage ("Download Repo WebGoart") {
	    steps{
	    	git(
            	   branch: "develop",
            	   credentialsId: "github",
            	   url: "https://github.com/WebGoat/WebGoat.git"
               ) 
               //sh "wget https://github.com/WebGoat/WebGoat/releases/download/v8.2.2/webgoat-server-8.2.2.jar"
               sh "java --version"
               sh "ls -la"
	    }
	}
	stage ("Test SonarQube for WebGoat") {
	    steps{
	        sh "./mvnw clean verify sonar:sonar \
               -Dsonar.projectKey=Test \
               -Dsonar.host.url=http://localhost:9000 \
               -Dsonar.login=d05c2de052a74c77850cc000e398006361f324e2\
               -Dmaven.test.failure.ignore=true\
               -Dmaven.test.skip=true"
	    }
    	}
    	stage ("Build WebGoat") {
	    steps{
	        sh "./mvnw clean install -Dmaven.test.failure.ignore=true -Dmaven.test.skip=true -e"
	    }
    	}
    }
}
    	
    	    
    	
    	
    	
    	
    	
    
 
       
