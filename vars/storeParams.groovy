// vars/storeParams.groovy

def call(Map params) {
    def buildId = params.buildId
    def deposit = params.deposit

    // Store the parameters in a file
    writeFile file: "/var/lib/jenkins/workspace/parameter_values.txt", text: "Build ID: ${buildId}\nDeposit: ${deposit}"
}