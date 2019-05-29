package manifesto.groovy

import groovy.transform.CompileStatic

@CompileStatic
class Conference implements Event {

    private static final Map<String, Conference> CONFERENCES = [:]

    static Conference create(String name) {
        CONFERENCES.computeIfAbsent(name) {
            new Conference(name)
        }
    }

    private final String  name;
    private final List<Session> sessions = []

    Conference(String name) {
        this.name = name
    }

    @Override
    void addSession(Session session) {
        sessions.add(session)
    }

    @Override
    Iterable<Session> getSessions() {
        return sessions.asImmutable()
    }

    @Override
    Iterator<Session> iterator() {
        return sessions.iterator()
    }

}
