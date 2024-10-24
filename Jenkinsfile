pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/madhankaraditya/SpringBootApplication.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn -v' // Check Maven version
                sh 'mvn clean install -X' // Build with Maven and enable debug output
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("myapp/springboot-java:latest")
                }
            }
        }

        stage('Deploy Docker Image') {
            steps {
                script {
                    // Run Docker container on the server
                    sh """
                        docker stop springboot_app || true
                        docker rm springboot_app || true
                        docker run -d --name springboot_app -p 8080:8080 myapp/springboot-java:latest
                    """
                }
            }
        }
    }
}
