//For import we should you package , so that it will easy to call in pipelines

package com.i27Acadamy.Builds;
class caluculator{
    def jenkins

   caluculator(jenkins) {
            this.jenkins = jenkins
    }

    //need to create 2 methods Addition and subtraction

   // Addition method
   def add(first_number,second_number){
     return first_number+second_number
   }

   def multiply(first_number,second_number){
     return first_number*second_number
   }

}
