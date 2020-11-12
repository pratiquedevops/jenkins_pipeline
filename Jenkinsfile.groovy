import org.apache.tools.ant.types.Environment

pipeline {
    agent any
    environnement{

    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Nana') {
            steps {
                echo 'Hello Nana'
            }
        }
        stage('Moro') {
            steps {
                echo 'Hello Moro'
            }
        }
    }
}
