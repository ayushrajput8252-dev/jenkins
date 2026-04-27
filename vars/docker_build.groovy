def call(String projectName, String imageTag, String dockerHubUserName) {
    sh "docker build -t ${dockerHubUserName}/${projectName}:${imageTag} ."
}
