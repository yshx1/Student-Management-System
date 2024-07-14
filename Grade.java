import java.util.HashMap;
import java.util.Map;

public class Grade {
    private Map<String, Double> gradeRecords;

    public Grade() {
        gradeRecords = new HashMap<>();
    }

    public void addGrade(String studentId, double grade) {
        gradeRecords.put(studentId, grade);
    }

    public double getGrade(String studentId) {
        return gradeRecords.getOrDefault(studentId, 0.0);
    }

    // Other methods as needed
}
