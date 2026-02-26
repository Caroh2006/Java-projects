package universitysystem;

public class student extends person implements Registration, FeePayment {
    private String program;

    public student(String name, String id, String program) {
        super(name, id);
        this.program = program;;
    }

    @Override
    public void displayrole() {
        System.out.println("Role: Student in program " + program);
    }

    @Override
    public void registerCourse(String courseName) {
        System.out.println("Registered for course: " + courseName);
    }

    @Override
    public void payFee(double amount) {
        System.out.println("Paid fee: $" + amount);
    }
    
}
