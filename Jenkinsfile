pipeline {
    agent any

    tools {
        maven 'Maven_Latest'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'Main', url: 'https://github.com/RiddhiPatil15/Extent_Report.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Report') {
            steps {
                publishHTML([
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportName: 'Extent Report',
                    reportDir: 'target',
                    reportFiles: 'ExtentReport.html'
                ])
            }
        }
    }
}

