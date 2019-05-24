package manifesto.groovy

import groovy.transform.CompileStatic

@CompileStatic
enum Conference implements Event {

    INSTANCE

    private final List<Session> sessions = []

    @Override
    void addSession(Session session) {
        sessions.add(session)
    }

    @Override
    Iterable<Session> getSessions() {
        return sessions.asImmutable()
    }

}
