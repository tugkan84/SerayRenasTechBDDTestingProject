pipeline 
{
    agent any

    stages 
    {
        stage('Build') 
        {
            steps 
            {
                echo 'Build App'
            }
        }

        stage('Test') 
        {
            steps 
            {
                sh './mvnw clean test'
            }
        }
        post{
            always{
                junit '**/surefire-reports/*.xml'
            }
        }
    }
}
