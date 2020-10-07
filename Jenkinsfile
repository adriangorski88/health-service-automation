pipeline {
    agent any
    stages {
        stage('Maven clean') {
            steps {
                sh "mvn clean"
            }
        }
        stage('Maven test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Maven package ') {
            steps {
                sh "mvn package"
            }
        }
    }
}
