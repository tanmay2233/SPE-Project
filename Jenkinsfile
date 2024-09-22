pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'calculator-miniproject'
        GITHUB_REPO_URL = 'https://github.com/tanmay2233/SPE-Project.git'
    }
    
    stages {
    
        stage("Checkout") {
            steps {
                script {
                    // get the github branch
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }
        
        stage("Build") {
            steps {
                script {
                    // create the jar file
                    dir("Calculator") {
                        sh 'mvn clean package'
                    }
                }
            }   
        }
        
        stage("Test") {
            steps {
                script {
                    // run unit tests
                    dir("Calculator") {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage("Dockerize") {
            steps {
                script {
                    // build the docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')

                    // push the image to docker hub
                    docker.withRegistry('', 'DockerHubCred') {
                        sh 'docker tag calculator-miniproject tanmay2233/calculator-miniproject:latest'
                        sh 'docker push tanmay2233/calculator-miniproject'
                    }
                }
            }
        }

        stage("Deploy") {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory.ini'
                    )
                }
            }
        }
    }

}