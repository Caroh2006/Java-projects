package universitysystem;

public class Lecturer extends Staff implements Registration {
    public Lecturer(String name, String id, String department) {
        super(name, id, department);
    }
    @Override
    public void displayRole() {
        System.out.println("Role: Lecturer in department " ););
    }
    @Override
    public void registerCourse(String courseName) {
        System.out.println(getName() + " assigned to teach" + courseName);
    }
}