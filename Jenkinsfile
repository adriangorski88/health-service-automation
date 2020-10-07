pipeline {
    agent any
    tools { 
        maven '3.6.3' 
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
