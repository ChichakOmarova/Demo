package EventManagementSystem;
import java.util.LinkedList;
class Attendee {
    String name;
    String email;
    String sessionTitle;

    public Attendee(String name, String email, String sessionTitle) {
        this.name = name;
        this.email = email;
        this.sessionTitle = sessionTitle;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sessionTitle='" + sessionTitle + '\'' +
                '}';
    }
}