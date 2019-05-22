package manifesto.groovy

import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

@CompileStatic
class StaticVsDynamic {

    String readSomething(Map<String, Object> map) {
        map.something
    }

    @CompileDynamic
    String readSomethingElse(Node node) {
        node.something.else
    }

}
