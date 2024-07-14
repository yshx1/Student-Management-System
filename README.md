
# Student Management System

## Project Description

The Student Management System project is a Java application designed to manage student records efficiently. It provides functionalities for student registration, grade tracking, and attendance management. This system aims to streamline academic operations and ensure organized handling of student information.

## Features

- **Student Registration:** Allows users to register new students with details such as student ID, name, and email.
- **Grade Tracking:** Enables recording and tracking of grades for each student across various courses.
- **Attendance Management:** Facilitates marking attendance for students in different courses.
- **Efficient Data Handling:** Ensures persistence of student records using data structures like maps for efficient retrieval and management.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Integrated Development Environment (IDE) like Eclipse or IntelliJ IDEA
- Git installed (optional, for cloning the repository)

### Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yshx1/student-management-system.git
   cd student-management-system
   ```

2. Open the project in your IDE.

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the application:
   ```bash
   java Main
   ```

### Usage

1. **Student Registration:**
   - Enter student details such as student ID, name, and email to register a new student.

2. **Grade Tracking:**
   - Add grades for students by entering their student ID and the corresponding grade.

3. **Attendance Management:**
   - Mark attendance for students in different courses by specifying their student ID and attendance status.

4. **Exiting the Program:**
   - Use the exit option to close the application and save all changes.

### Example

```bash
1. Register Student
2. Add Grade
3. Mark Attendance
4. Exit

Choose an option: 1
Enter student ID: S001
Enter student name: John Doe
Enter student email: john.doe@example.com
Student registered successfully: Student{studentId='S001', name='John Doe', email='john.doe@example.com'}

Choose an option: 2
Enter student ID: S001
Enter grade: 85
Grade added for student ID S001: 85.0

Choose an option: 3
Enter student ID: S001
Is student present? (true/false): true
Attendance marked for student ID S001: present

Choose an option: 4
Exiting...
```

