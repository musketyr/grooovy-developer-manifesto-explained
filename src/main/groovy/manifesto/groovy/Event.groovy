package manifesto.groovy

interface Event extends Iterable<Session> {

    void addSession(Session session)
    Iterable<Session> getSessions()

}