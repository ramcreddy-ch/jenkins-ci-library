package com.example

class PipelineUtils implements Serializable {
    def steps
    
    PipelineUtils(steps) {
        this.steps = steps
    }

    def getVersion() {
        return "1.0.0-${steps.env.BUILD_NUMBER}"
    }
}
