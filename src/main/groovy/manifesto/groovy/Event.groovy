package manifesto.groovy

interface Event {

    void addSession(Session session)
    Iterable<Session> getSessions()

}