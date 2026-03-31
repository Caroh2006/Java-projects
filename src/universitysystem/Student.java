package universitysystem;

import java.util.ArrayList;

public class Student extends Person implements Registration, FeePayment {

    private String program;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student in program " + program);
    }

    @Override
    public void registerCourse(String courseName) {
        courses.add(courseName);
        System.out.println("Registered for course: " + courseName);
    }

    @Override
    public void payFee(double amount) {
        System.out.println(getName() + " paid fee: $" + amount);
    }

    public String getProgram() {
        return program;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}
