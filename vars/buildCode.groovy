def call () {
  sh 'mvn clean compile -P jacoco:report sonar:sonar war:war'
}
