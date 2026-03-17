

public abstract class Staff extends Person {
    private String department;

    public Staff(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }
}
