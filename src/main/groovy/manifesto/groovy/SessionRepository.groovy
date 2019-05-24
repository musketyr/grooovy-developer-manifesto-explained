package manifesto.groovy

import groovy.transform.CompileStatic
import groovy.transform.NamedDelegate
import groovy.transform.NamedVariant
import groovy.transform.stc.ClosureParams
import groovy.transform.stc.SimpleType

@CompileStatic
class SessionRepository {

    Iterable<Session> filterSession(Iterable<Session> all, SessionType type) {
        return all.findAll { Session session ->
            session.type == type
        }
    }

    Iterable<Session> filterSession(Iterable<Session> all, SessionType type, Map options) {
        Collection<Session> result = all.findAll { Session session ->
            session.type == type
        }

        if (options.offset) {
            result = result.drop(options.offset as Integer)
        }

        if (options.limit) {
            result = result.take(options.limit as Integer)
        }

        return result
    }

    Iterable<Session> filterSession(Iterable<Session> all, SessionType type, PaginationOptions options) {
        Collection result = all.findAll { Session session ->
            session.type == type
        }
        return result.drop(options.offset).take(options.limit)
    }

    @NamedVariant
    Iterable<Session> filterSession2(
            Iterable<Session> all,
            SessionType type,
            @NamedDelegate PaginationOptions options
    ) {
        Collection<Session> result = all.findAll { Session session ->
            session.type == type
        }
        return result.drop(options.offset).take(options.limit)
    }

Iterable<Session> filterSession(
        Iterable<Session> all,
        SessionType type,
        @DelegatesTo(
                value = PaginationOptions.Builder,
                strategy = Closure.DELEGATE_FIRST
        )
        @ClosureParams(
                value = SimpleType,
                options = 'manifesto.groovy.PaginationOptions.Builder'
        )
                Closure<PaginationOptions.Builder> paginationOptions
) {
    Collection<Session> result = all.findAll { Session session ->
        session.type == type
    }
    PaginationOptions.Builder builder = new PaginationOptions.Builder()
    builder.with paginationOptions
    PaginationOptions options = builder.build()
    return result.drop(options.offset).take(options.limit)
}


}
