import SampleClass

class JenkinMaster {

    static main(args) {
        def scobj = new SampleClass("Input.json")
        println "Details of Job: Nightly_FPM_Deployment_package_new \n" + scobj.GetJobDetails('Nightly_FPM_Deployment_package_new')
    }

}
