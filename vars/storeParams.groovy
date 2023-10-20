// ParameterStorage.groovy
def storeBuildParameters(build, params) {
    def previousParams = build.getActions(hudson.model.ParametersAction.class)
    previousParams.each { action ->
        action.parameters.each { param ->
            params.put(param.name, param.value)
        }
    }
}

def getPreviousBuildParameters(build) {
    def params = [:]
    storeBuildParameters(build, params)
    return params
}
