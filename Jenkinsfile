pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'Main', url: 'https://github.com/RiddhiPatil15/Extent_Report.git'
            }
        }

        tools {
            maven 'Maven_Latest'
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
                    reportDir: 'reports',
                    reportFiles: 'extent-report.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}

