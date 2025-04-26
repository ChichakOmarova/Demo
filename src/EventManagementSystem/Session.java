package EventManagementSystem;
import java.util.ArrayList;
import java.util.LinkedList;

class Session {
    String title;
    String speakerName;
    String time;

    public Session(String title, String speakerName, String time) {
        this.title = title;
        this.speakerName = speakerName;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Session{" +
                "title='" + title + '\'' +
                ", speakerName='" + speakerName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}