package manifesto.groovy

import groovy.transform.CompileStatic

@CompileStatic
static String aMethod() {
    def r = 'a string'
    System.out.println "result is now ${r.getClass()}"
    // imagine plenty of code
    r = [trash: 'bin']
    // imagine plenty of code
    System.out.println "result is now ${r.getClass()}"
    return r
}

println "r: ${aMethod()}"

