pipeline {
    agent any
    
    tools {
        maven "maven"
    }
    
    stages {
        stage('Maven clean ') {
            steps {
                bat "mvn clean"
            }
        }
        stage('Maven test') {
            steps {
                bat "mvn test-compile"
            }
        }
    }
}
