public abstract class staff extends person {
    private String department;

    public staff(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void performDuties() {
        System.out.println(getName() + " is performing staff duties in the " + department + " department.");
    }
    
}
