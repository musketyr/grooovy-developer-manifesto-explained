package manifesto.groovy

import groovy.transform.CompileStatic

@CompileStatic
class SessionRepository {

    Iterable<Session> filterSession(Iterable<Session> all, SessionType type) {
        return all.findAll { Session session ->
            session.type == type
        }
    }

}
