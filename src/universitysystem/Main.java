package universitysystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void saveStudents(ArrayList<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student s : students) {
                writer.write(s.getId() + "," + s.getName() + "," + s.getProgram());
                writer.newLine();
            }

            System.out.println("Data saved successfully to students.txt");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
    public static void loadStudents(ArrayList<Student> students) {
        File file = new File("students.txt");
        if (!file.exists()) {
            System.out.println("No previous data found.");
            return;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                Student s = new Student(data[1], data[0], data[2]);
                students.add(s);
            }
        System.out.println("Previous data loaded successfully from students.txt");
      }     catch (IOException e) {
            System.out.println("Error loading file.");
      }
        }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       loadStudents(students);
     try {
            System.out.println("--- New Student Registration ---");
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student id: ");
            String id = scanner.nextLine();
            System.out.print("Enter program: ");
            String program = scanner.nextLine();

            Student newStudent = new Student(name, id, program);
            students.add(newStudent);
            newStudent.displayRole();
            System.out.print("Enter fee amount to pay: ");
            double fee = scanner.nextDouble();
            newStudent.payFee(fee);

            saveStudents(students);

        } catch (Exception e) {
            System.out.println("Error: Invalid Input.");
        } finally {
            System.out.println("System finished safely.");
            scanner.close();
        }
    }

}