pipeline {
    agent any
    deleteDir()
    git(
            branch: "master",
            credentialsId: "github",
            url: "https://github.com/Mugadina/Repo.git"
    )
}    
