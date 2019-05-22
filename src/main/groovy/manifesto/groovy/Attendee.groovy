package manifesto.groovy

interface Attendee {

    void voteForSession(String sessionName, int points)
    void voteForSession(String sessionName, int points, String remarks)

}
