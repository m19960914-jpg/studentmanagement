package raisetech.studentmanagement;

import java.time.LocalDate;

public class students_courses {
    private int id;

    private int studentId;     // student_id にマッピングされます
    private String courseName; // course_name にマッピングされます
    private LocalDate startDate; // start_date にマッピングされます
    private LocalDate endDate;   // end_date にマッピングされます

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
