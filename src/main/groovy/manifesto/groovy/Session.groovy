package manifesto.groovy

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class Session {

    final String name
    final SessionType type

    Session(String name, SessionType type) {
        this.name = name
        this.type = type
    }

}
