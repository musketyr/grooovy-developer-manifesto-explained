package manifesto.java;

import java.util.Objects;

public class Session {

    private final String name;
    private final SessionType type;

    public Session(String name, SessionType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public SessionType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(name, session.name) &&
                type == session.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Session{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
