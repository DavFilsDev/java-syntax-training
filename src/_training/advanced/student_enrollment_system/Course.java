package _training.advanced.student_enrollment_system;

import java.util.*;

public class Course {
    private final String id;
    private final String title;
    private final Set<Student> enrolledStudents = new HashSet<>();

    public Course(String title) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public Set<Student> getEnrolledStudents() { return enrolledStudents; }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public String toString() {
        return "Course{title='%s'}".formatted(title);
    }
}
