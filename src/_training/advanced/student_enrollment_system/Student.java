package _training.advanced.student_enrollment_system;

import java.util.*;

public class Student {
    private final String id;
    private final String name;
    private final Set<Course> courses = new HashSet<>();

    public Student(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Set<Course> getCourses() { return courses; }

    public void enroll(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{name='%s'}".formatted(name);
    }
}
