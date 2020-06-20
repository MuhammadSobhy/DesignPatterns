pipeline {
   agent any
   stages {
      stage('Build') {
         steps {
            checkout scm
            sh 'mvn clean install'
         }
         post {
            success {
               archiveArtifacts 'target/*.jar'
            }
         }
      }
   }
}
