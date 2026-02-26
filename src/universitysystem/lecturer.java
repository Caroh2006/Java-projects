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
<<<<<<< HEAD
    
}

=======
>>>>>>> 1c71252978029b9ae2f636f53a1d41828f03a99c
