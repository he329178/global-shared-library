def call () {  
  sh 'mvn sonar:sonar -Dsonar.projectKey=gitopscalculator -Dsonar.host.url=https://sonar.phvr.co.in -Dsonar.login=281cd687d0a65796d8dc0068a4b3251a62dc8444'
}
