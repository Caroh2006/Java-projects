# University Management System

## Project Description
This project is a Java-based University Management System developed using Object-Oriented Programming (OOP) principles.  
It allows users to manage university data dynamically, including:
- Student details
- Course information
- Lecturer and staff information
- Fee payment and registration

The system demonstrates inheritance (Person → Student/Lecturer/Staff) and encapsulation of attributes and methods.

---

## Classes Implemented

1. **Person** – Base class for common attributes such as `name` and `id`.
2. **Student** – Inherits from Person, allows course registration and fee payment.
3. **Lecturer** – Inherits from Person, allows course assignment.
4. **Staff** – Inherits from Person, can manage administrative tasks.
5. **Course** – Stores course information (name, code).
6. **Registration** – Handles the linking of students to courses.
7. **FeePayment** – Handles payment logic for students.
8. **Main** – Runs the system, accepts user input, and coordinates all classes.

---

## Improvements Made

### 1. Dynamic Input
- All user data is now entered at runtime using `Scanner`.
- Examples:
  - Student name, ID, program
  - Course name, code
  - Lecturer name, ID, department
  - Fee amount

### 2. Exception Handling
- Implemented `try-catch-finally` blocks to ensure the program does not crash on invalid input.
- Handles:
  - Non-numeric inputs for numbers
  - Empty strings for names or course codes
  - Negative fee amounts or invalid IDs
- `finally` block confirms program execution completed safely.

### 3. Program Robustness
- The system can now handle errors gracefully and continue running.
- Improved user experience with clear prompts and error messages.
- Makes the system interactive instead of using hardcoded values.

---

## Exceptions Implemented
- Invalid student ID (negative or zero)
- Empty student or lecturer name
- Empty course name or invalid course codes
- Fee payments with negative values
- Wrong menu input in Main

---

## Usage Instructions

1. Run the `Main.java` file in your Java IDE or terminal.
2. Follow prompts to input student, course, lecturer, and fee details.
3. The system will display the entered details and confirm registration or payment.
4. Errors in input will be caught and displayed; the program will continue safely.

---

## Conclusion
This University Management System demonstrates key OOP concepts, dynamic input handling, and exception handling in Java.  
The system is now more interactive, user-friendly, and robust, meeting the assignment requirements.