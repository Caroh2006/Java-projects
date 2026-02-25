package universitysystem;

class Student extends Person implements Registration, FeePayment {
    private String program;

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void registerCourse(String courseName) {
        System.out.println(getName() + " enrolled in " + courseName);
    }

    @Override
    public void payFee(double amount) {
        System.out.println(getName() + " paid fee: " + amount);
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Student.");
    }age universitysystem;

class Student extends Person implements Registration, FeePayment {
    private String program;

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void registerCourse(String courseName) {
        System.out.println(getName() + " enrolled in " + courseName);
    }

    @Override
    public void displayrole() {
        System.out.println("I am a Student");
    }
}
    public String getprogram() {
        return program;
}
    public void setprogram(String program) {
        this.program = program;
    }
}
