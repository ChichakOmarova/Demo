package EventManagementSystem;
import java.util.ArrayList;
import java.util.LinkedList;


public class SystemMain {
    public static void main(String[] args) {
        System.out.println("=== SESSION MANAGEMENT ===");
        ArrayList<Session> sessions = new ArrayList<>();
        sessions.add(new Session("Java Fundamentals", "Dr. Smith", "09:00 AM"));
        sessions.add(new Session("Web Development", "Prof. Johnson", "10:30 AM"));
        sessions.add(new Session("Data Science", "Dr. Williams", "12:00 PM"));
        sessions.add(new Session("Cloud Computing", "Ms. Brown", "02:00 PM"));
        sessions.add(new Session("Mobile Apps", "Mr. Davis", "03:30 PM"));
        sessions.add(new Session("AI & ML", "Dr. Miller", "05:00 PM"));

        System.out.println("\nFirst session: " + sessions.get(0));
        System.out.println("Last session: " + sessions.get(sessions.size()-1));

        System.out.println("\nRemoving session: " + sessions.get(2).title);
        sessions.remove(2);
        System.out.println("Updated sessions list:");
        sessions.forEach(System.out::println);
        System.out.println("\nUpdating Web Development session speaker");
        sessions.set(1, new Session("Web Development", "Prof. Anderson", "10:30 AM"));
        System.out.println("Updated sessions list:");
        sessions.forEach(System.out::println);

        System.out.println("\n=== ATTENDEE MANAGEMENT ===");
        LinkedList<Attendee> javaAttendees = new LinkedList<>();
        LinkedList<Attendee> webAttendees = new LinkedList<>();
        LinkedList<Attendee> cloudAttendees = new LinkedList<>();
        LinkedList<Attendee> mobileAttendees = new LinkedList<>();
        LinkedList<Attendee> aiAttendees = new LinkedList<>();

        addAttendees(javaAttendees, "Java Fundamentals");
        addAttendees(webAttendees, "Web Development");
        addAttendees(cloudAttendees, "Cloud Computing");
        addAttendees(mobileAttendees, "Mobile Apps");
        addAttendees(aiAttendees, "AI & ML");

        System.out.println("\nNew attendee registering for Web Development");
        webAttendees.add(new Attendee("New Participant", "new@email.com", "Web Development"));
        System.out.println("Total attendees for Web Development: " + webAttendees.size());

        System.out.println("\nChecking in attendees for Java Fundamentals:");
        while (!javaAttendees.isEmpty()) {
            Attendee checkingIn = javaAttendees.removeFirst();
            System.out.println("Checked in: " + checkingIn.name + " for " + checkingIn.sessionTitle);
        }
        System.out.println("All attendees checked in - Java Fundamentals session is full!");
    }

    private static void addAttendees(LinkedList<Attendee> list, String sessionTitle) {
        list.add(new Attendee("Alice", "alice@email.com", sessionTitle));
        list.add(new Attendee("Bob", "bob@email.com", sessionTitle));
        list.add(new Attendee("Charlie", "charlie@email.com", sessionTitle));
        list.add(new Attendee("Diana", "diana@email.com", sessionTitle));
        list.add(new Attendee("Eve", "eve@email.com", sessionTitle));
    }
}