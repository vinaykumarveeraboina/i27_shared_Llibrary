import com.i27Acadamy.Builds.caluculator; 
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
}
