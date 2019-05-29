package manifesto.groovy

import groovy.transform.CompileStatic

class Whatever {

    def doSomeStuff(a, b, c) {
        def iDontCare = c
        if (iDontCare < a) {
            iDontCare = "I don't care"
        } else if (iDontCare > b) {
            iDontCare = "I don't care anyway"
        }
        return "$iDontCare about other developers".bytes
    }

}
