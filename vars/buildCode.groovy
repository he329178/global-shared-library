def call () {
  sh 'mvn clean package -DskipTests=true'
  //sh 'mvn package -DskipTests=true'
}
