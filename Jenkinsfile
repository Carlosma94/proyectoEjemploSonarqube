pipeline {
    agent any
    tools {
      maven 'MiMaven'
    }

    stages {
        stage('Compilacion') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Compilacion de pruebas unitarias') {
            steps {
                sh 'mvn test-compile'
            }
        }
        stage('Ejecución de pruebas unitarias') {
            steps {
                sh 'mvn test jacoco:report'
            }
        }
        stage('Lanzar el analisis de Sonarqube') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
        stage("Esperar la respuesta del Sonarqube") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}