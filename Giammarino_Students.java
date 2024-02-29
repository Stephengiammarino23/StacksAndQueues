import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
public class Giammarino_Students {
    private int id;
    private String firstName;
    private String lastName;

    public Giammarino_Students(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public boolean isEqual(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Giammarino_Students)) return false;
        Giammarino_Students otherStudent = (Giammarino_Students) obj;
        return this.id == otherStudent.id;
    }
}

