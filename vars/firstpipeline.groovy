import com.i27Acadamy.Builds.Caluculator; 
  //importing build , inside builds we may have many groovys , so we are specifing caluculator(class name ) in import 
def call(MAP pipelineParams){
        library("com.i27.slb")
  Caluculator cals = new Caluculator(this)  //creating a constructure
pipeline{
    agent any 
    environments{
        APP_NAME={pipelineparams.app_Name}
    }
   stages{
    stage('addition')
    {
        steps{
            script{
            echo "printing sum of 2 numbers"
            println cals.add(3,4)
        }
        }
    }
   }
}
}