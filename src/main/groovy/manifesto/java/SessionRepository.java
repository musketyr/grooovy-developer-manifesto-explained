package manifesto.java;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class SessionRepository {

    Iterable<Session> filterSession(Iterable<Session> all, SessionType type) {
        return StreamSupport.stream(all.spliterator(), true)
                .filter(s -> type.equals(s.getType()))
                .collect(Collectors.toList());
    }

}
