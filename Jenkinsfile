pipeline {
    agent none
    stages {
        stage('run all') {
            parallel {
                stage('test') {
                    agent {
                        docker {
                            image 'maven:3.6.3-adoptopenjdk-14'
                        }
                    }
                    steps {
                        sh 'mvn test'
                    }
                }
                stage('build image') {
                    agent {
                        docker {
                            image 'maven:3.6.3-adoptopenjdk-14'
                            args '--network nexusjenkins'
                        }
                    }
                    steps {
                        configFileProvider(
                        [configFile(fileId: 'karina_settings_nexus', variable: 'MAVEN_SETTINGS')]) {
                        sh 'mvn -s $MAVEN_SETTINGS clean deploy'
    }
                
                    }
                }

                
            }
        }
    }
}
