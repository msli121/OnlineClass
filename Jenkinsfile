pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
            timeout(time: 3) {
                sh 'echo "Hello World"'
                sh '''
                echo "Multiline shell steps works too"
                ls -lah
                '''
                }
            }
        }
    }
}