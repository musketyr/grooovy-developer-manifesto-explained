package manifesto.java;

public interface Attendee {

    default void voteForSession(String sessionName, int points) {
        voteForSession(sessionName, points, null);
    };

    void voteForSession(String sessionName, int points, String remarks);

}
