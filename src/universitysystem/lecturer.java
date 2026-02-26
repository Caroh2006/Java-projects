package universitysystem;

public class Lecturer extends staff {
    public Lecturer(String name, int id, String department) {
        super(name, id, department);
    }
    @Override
    public void displayrole() {
        System.out.println("I am a Lecturer");
    }
    @Override
    public void performDuties() {
        System.out.println("Teaching and grading students");
    }
    
}

