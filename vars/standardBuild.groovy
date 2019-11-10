def call(Map config) {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    sh "mvn clean package"
                }
            }
            stage('Unit Test') {
                steps {
                    sh "mvn test"
                }
            }
        }
    }
}
