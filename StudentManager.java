import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {
    private Map<String, Student> students;
    private List<Course> courses;
    private Grade gradeManager;
    private Attendance attendanceManager;

    public StudentManager() {
        students = new HashMap<>();
        courses = new ArrayList<>();
        gradeManager = new Grade();
        attendanceManager = new Attendance();
    }

    public void registerStudent(String studentId, String name, String email) {
        Student student = new Student(studentId, name, email);
        students.put(studentId, student);
        System.out.println("Student registered successfully: " + student);
    }

    public void addCourse(String courseCode, String courseName) {
        Course course = new Course(courseCode, courseName);
        courses.add(course);
        System.out.println("Course added successfully: " + course);
    }

    public void markAttendance(String studentId, boolean present) {
        attendanceManager.markAttendance(studentId, present);
        String status = present ? "present" : "absent";
        System.out.println("Attendance marked for student ID " + studentId + ": " + status);
    }

    public void addGrade(String studentId, double grade) {
        gradeManager.addGrade(studentId, grade);
        System.out.println("Grade added for student ID " + studentId + ": " + grade);
    }

    // Other methods as needed for managing students and courses

    public Map<String, Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
