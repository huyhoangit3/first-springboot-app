pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git(
                       url: 'git@github.com:huyhoangit3/first-springboot-app.git',
                       credentialsId: 'github-credentials',
                )
                // Run Maven on a Unix agent.
                dir("/var/jenkins_home/workspace/FirstSpringBootApp") {
                    sh "/opt/maven3.8/bin/mvn -Dmaven.test.failure.ignore=true clean package"
                }
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    archiveArtifacts 'target/*.war'
                }
            }
        }
        stage('Deploy') {
            steps {
//                 dir("/var/jenkins_home/workspace/FirstSpringBootApp/target") {
//                     sh "scp *.war root@172.17.0.3:/opt/tomcat8/webapps"
//                 }

                sh '/var/jenkins_home/scripts/deploy.sh'
            }
        }
    }
}
