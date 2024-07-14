import java.util.HashMap;
import java.util.Map;

public class Attendance {
    private Map<String, Boolean> attendanceRecords;

    public Attendance() {
        attendanceRecords = new HashMap<>();
    }

    public void markAttendance(String studentId, boolean present) {
        attendanceRecords.put(studentId, present);
    }

    public boolean isPresent(String studentId) {
        return attendanceRecords.getOrDefault(studentId, false);
    }

    // Other methods as needed
}
