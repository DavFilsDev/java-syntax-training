package _training.advanced.student_enrollment_system;

import java.util.*;

public class EnrollmentService {
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, Course> courses = new HashMap<>();

    public Student createStudent(String name) {
        Student s = new Student(name);
        students.put(s.getId(), s);
        return s;
    }

    public Course createCourse(String title) {
        Course c = new Course(title);
        courses.put(c.getId(), c);
        return c;
    }

    public boolean enrollStudent(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (student != null && course != null) {
            student.enroll(course);
            course.addStudent(student);
            return true;
        }
        return false;
    }

    public Set<Course> getCoursesOfStudent(String studentId) {
        Student student = students.get(studentId);
        return student != null ? student.getCourses() : Set.of();
    }

    public Set<Student> getStudentsInCourse(String courseId) {
        Course course = courses.get(courseId);
        return course != null ? course.getEnrolledStudents() : Set.of();
    }
}
