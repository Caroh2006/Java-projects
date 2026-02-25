package universitysystem;

public class student extends person implements Registration, FeePayment {
    private String program;

    public student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void registerCourse(String courseName) {
        System.out.println(getName() + " enrolled in " + courseName);
    }
    @Override
    public void payFee(double amount) {
        System.out.println(getName() + " paid fee:" + amount);
    }


    @Override
    public void displayrole() {
        System.out.println("I am a Student");
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
}