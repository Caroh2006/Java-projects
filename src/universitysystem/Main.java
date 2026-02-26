package universitysystem;
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Programming", 101);
        Student student1 = new Student("Leah", "S123", "Programming");
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "456", "Computer Science");

        student1.displayRole();
        student1.payFee(1500.00);
        student1.registerCourse("Programming");

        lecturer1.displayRole();
        lecturer1.registerCourse("Programming");
    }
}