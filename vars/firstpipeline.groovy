

import com.i27Acadamy.Builds.Calculator

def call(Map pipelineParams){
    library("com.i27.slb")
    Calculator calculator = new Calculator(this)
    pipeline {
        agent any 
        environment {
            APP_NAME = "${pipelineParams.appName}"
        }
        stages {
            stage ('AdditionStage') {
                steps {
                    script {
                        echo "Printing Sum of 2 numbers"
                        println calculator.add(3,4)
                        //sub(10,9) // 10-9 = 1
                        //sub(9,10) //9-10 = -1
                        echo "Microservice Name is: ${APP_NAME}"
                    }
                }
            }
            stage ('Nothing') {
                steps {
                    echo "Printing text not from groovy files"
                }
            }
        }
    }
}



/*import com.i27Acadamy.Builds.caluculator; 
  //importing build , inside builds we may have many groovys , so we are specifing caluculator(class name ) in import 
def call(Map pipelineParams){
        library("com.i27.slb")
  caluculator cal = new caluculator(this)  //creating a constructure
pipeline{
    agent any 
    environment {
        APP_NAME="${pipelineparams.app_Name}"
    }
   stages{
    stage('addition')
    {
        steps{
            script{
            echo "printing sum of 2 numbers"
            println cal.add(3,4)
        }
        }
    }
   }
}
}*/
