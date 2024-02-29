public class BathroomChallenge_Giammarino {

    public static void main(String[] args) {
        Giammarino_Bathroom bathroom1 = new Giammarino_Bathroom(3);
        Giammarino_Bathroom bathroom2 = new Giammarino_Bathroom(2);

        Giammarino_Students James = new Giammarino_Students(1, "James", "Washington");
        Giammarino_Students David = new Giammarino_Students(2, "David", "Monte");
        Giammarino_Students JohnDoe = new Giammarino_Students(9, "John", "Doe");
        Giammarino_Students JohnSmith = new Giammarino_Students(8, "John", "Smith");
        Giammarino_Students Chuck = new Giammarino_Students(7, "Chuck", "Gary");
        Giammarino_Students Janette = new Giammarino_Students(11, "Janette", "Reed");
        Giammarino_Students Jane = new Giammarino_Students(10, "Jane", "Doe");
        Giammarino_Students Rachel = new Giammarino_Students(6, "Rachel", "Bobson");
        Giammarino_Students Michele = new Giammarino_Students(12, "Michele", "Mickey");

        bathroom1.addToLine(James);
        bathroom1.addToLine(David);
        bathroom1.addToLine(JohnDoe);
        bathroom1.addToLine(JohnSmith);
        bathroom1.addToLine(Chuck);

        bathroom2.addToLine(Janette);
        bathroom2.addToLine(Jane);
        bathroom2.addToLine(Rachel);
        bathroom2.addToLine(Michele);

        // Display students in bathrooms
        System.out.println("Students in bathroom1: " + bathroom1.getCurrentInBathroom());
        System.out.println("Students in bathroom2: " + bathroom2.getCurrentInBathroom());

        // Search for specific students in bathrooms
        System.out.println("James is in bathroom1: " + bathroom1.searchStudent(James));
        System.out.println("Chuck is in bathroom1: " + bathroom1.searchStudent(Chuck));
        System.out.println("James is in bathroom2: " + bathroom2.searchStudent(James));
        System.out.println("Davis is in bathroom1: " + bathroom1.searchStudent(new Giammarino_Students(5, "Davis", "Davidson")));

        bathroom1.leaveBathroom(James);
        bathroom2.leaveBathroom(Jane);

        bathroom1.test();
        bathroom2.test();

        bathroom1.clearData();
        System.out.println("Clearing data for bathroom1...");
        bathroom1.test();

        bathroom1.setCapacity(15);
        System.out.println("Changed bathroom1 capacity to 15.");

    }
}
