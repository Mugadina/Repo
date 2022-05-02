node("any") {
    deleteDir()
    final String bitbucketCredentialId = "Gigimon"
    final String workDir = pwd()
    String nexusType, urlBitbucketRepository
    if ("https://sbt-jenkins.sigma.sbrf.ru/".equals(env.JENKINS_URL)) {
        println("[INFO] Was chosen EDZ stand " + env.JENKINS_URL.toString())
        urlBitbucketRepository = "https://sbrf-bitbucket.sigma.sbrf.ru/scm/ci02503964/ci02505473_global_jobs.git"
    git(
            branch: "master",
            credentialsId: "${bitbucketCredentialId}",
            url: https://github.com/Mugadina/Repo.git
    )
}    
