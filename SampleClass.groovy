import groovy.json.JsonSlurper

class SampleClass {
    String file
    
    def GetJobDetails(String jobname) {                                // Return Job Details
        String jname = jobname
        def JobList = ReadInputFile().keySet()
        //println  "List of Jobs in Jenkins \n" + JobList.each{it}
        return ReadInputFile().get(jname)
     }
     
     def ReadInputFile(){                                            // Parse Input from The Json File
         def inputFile = new File(this.file)
         def InputJSON = new JsonSlurper().parse(inputFile)
         return InputJSON
     }
     
     def SampleClass(String file){                                     //Constructor
         this.file = file
     } 
    
        static main(args) {
        def scobj = new SampleClass("Input.json")
        println "Details of Job: Nightly_FPM_Deployment_package_new \n" + scobj.GetJobDetails('Nightly_FPM_Deployment_package_new')
    }

}