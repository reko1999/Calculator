pipeline {
    agent any

    stages {
        stage("GIT Clone"){
            steps{
                git url: "https://github.com/reko1999/Calculator.git", branch: "main"
            }
        }
        stage("Package"){
            steps{
                sh "chmod 777 ./mvnw"
                sh "./mvnw package"
            }
        }
    }
}