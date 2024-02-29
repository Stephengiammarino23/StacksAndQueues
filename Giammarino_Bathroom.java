import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

public class Giammarino_Bathroom {
    private int capacity;
    private List<Giammarino_Students> line;
    private LinkedTransferQueue<Giammarino_Students> recentVisits;

    public Giammarino_Bathroom(int capacity) {
        this.capacity = capacity;
        line = new ArrayList<>();
        recentVisits = new LinkedTransferQueue<>();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void clearData() {
        line.clear();
        recentVisits.clear();
    }

    public void addToLine(Giammarino_Students student) {
        if (!recentVisits.contains(student)) {
            line.add(student);
            recentVisits.offer(student);
        } else {
            System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " recently visited the bathroom.");
        }
    }

    public void leaveBathroom(Giammarino_Students student) {
        recentVisits.remove(student);
    }

    public List<Giammarino_Students> getCurrentInBathroom() {
        List<Giammarino_Students> currentInBathroom = new ArrayList<>(recentVisits);
        return currentInBathroom;
    }

    public String searchStudent(Giammarino_Students student) {
        if (recentVisits.contains(student)) {
            return "Student " + student.getFirstName() + " " + student.getLastName() + " is currently in the bathroom.";
        } else {
            return "Student " + student.getFirstName() + " " + student.getLastName() + " is not in the bathroom.";
        }
    }

    public int getLineLength() {
        return line.size();
    }

    public void test() {
    }
}

