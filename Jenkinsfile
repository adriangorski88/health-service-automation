pipeline {
    agent any
    stages {
        stage('Maven clean') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Maven test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Maven package') {
            steps {
                bat "mvn package"
            }
        }
    }
}
