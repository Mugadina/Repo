node("any") {
    deleteDir()
    final String bitbucketCredentialId = "Gigimon"
    final String workDir = pwd()
    String nexusType, urlBitbucketRepository
    git(
            branch: "master",
            credentialsId: "${bitbucketCredentialId}",
            url: https://github.com/Mugadina/Repo.git
    )
}    
