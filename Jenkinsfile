pipeline {
    agent any

    tools {
        maven 'Maven'   // Jenkins'te "Global Tool Configuration" altında tanımladığın Maven ismi
        jdk 'JDK'       // Jenkins'te tanımladığın JDK ismi
    }

    stages {
        stage('Checkout') {
            steps {
                // GitHub’daki kodu çekiyor
                git branch: 'main', url: 'git@github.com:yigitkoraycan/Playwright-Saucedemo.git'
            }
        }

        stage('Build') {
            steps {
                // Maven ile projeyi build ediyor
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                // Testleri çalıştırıyor
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Rapor ya da artifact ekleyeceksek buraya
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
