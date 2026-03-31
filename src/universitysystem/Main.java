package universitysystem;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    try{
        System.out.print("Enter course name:");
        String courseName = sc.nextLine();
        System.out.print("Enter course code:");
        int courseCode =sc.nextInt();
        sc.nextLine();
        Course course1 = new Course("Programming", 101);

        System.out.print("Enter student name:");
        String studentName = sc.nextLine();
        System.out.print("Enter student id:");
        String studentid =sc.nextLine();
        System.out.print("Enter program:");
        String program = sc.nextLine();
        Student student1 = new Student("Leah", "S123", "Programming");


        System.out.print("Enter lecturer name:");
        String lecturer = sc.nextLine();
        System.out.print("Enter lecturer id:");
        String lecturerid =sc.nextLine();
        System.out.print("Enter department:");
        String department = sc.nextLine();
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "456", "Computer Science");

        student1.displayRole();

        System.out.print("Enter fee amount:");
        double fee = sc.nextDouble();

        student1.payFee(1500.00);
        student1.registerCourse("Programming");

        lecturer1.displayRole();
        lecturer1.registerCourse("Programming");

    
    }catch (Exception msg) {
        System.out.print("Error:Inavlid Input:");
    }finally {
        System.out.println("System finished safely.");
    }
    }
}