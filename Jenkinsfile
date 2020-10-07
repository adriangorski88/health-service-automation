pipeline {
    agent any
    tools { 
        maven 'maven' 
        jdk 'openjdk' 
    }
    stages {
        stage('Maven clean ') {
            steps {
                sh "mvn clean"
            }
        }
        stage('Maven test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Maven package') {
            steps {
                sh "mvn package"
            }
        }
    }
}
