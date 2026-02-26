public abstract class person {
    private String name;
    private String id;
    
public person(String name, String id) {
    this.name = name;
    this.id = id;
}
public String getname() {
    return name;
}
public int getid() {
    return id;
}
public abstract void displayrole();

}




