package manifesto.groovy

import groovy.transform.CompileStatic
import spock.lang.Specification

import static manifesto.groovy.PaginationOptions.withOffset

class SessionRepositorySpec extends Specification {


    @CompileStatic
    void filterSessionsMap(SessionRepository repository, Iterable<Session> sessions, SessionType type) {
        repository.filterSession(sessions, type, [offset: 10])
    }

    @CompileStatic
    void filterSessionsObject(SessionRepository repository, Iterable<Session> sessions, SessionType type) {
        repository.filterSession(sessions, type, withOffset(10))
    }

    @CompileStatic
    void filterSessionsMap2(SessionRepository repository, Iterable<Session> sessions, SessionType type) {
        repository.filterSession2(sessions, type, limit: 2, foo: 'bar')
    }

    @CompileStatic
    void filterSessionsClosure(SessionRepository repository, Iterable<Session> sessions, SessionType type) {
        repository.filterSession(sessions, type) {
            offset 50
            limit 25
        }
    }

}
