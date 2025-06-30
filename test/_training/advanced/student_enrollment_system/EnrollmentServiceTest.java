package _training.advanced.student_enrollment_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentServiceTest {

    private EnrollmentService service;
    private Student student;
    private Course course;

    @BeforeEach
    void setUp() {
        service = new EnrollmentService();
        student = service.createStudent("Alice");
        course = service.createCourse("Mathematics");
    }

    @Test
    void testCreateStudentAndCourse() {
        assertNotNull(student.getId());
        assertNotNull(course.getId());
        assertEquals("Alice", student.getName());
        assertEquals("Mathematics", course.getTitle());
    }

    @Test
    void testEnrollStudent() {
        boolean enrolled = service.enrollStudent(student.getId(), course.getId());
        assertTrue(enrolled);

        Set<Course> studentCourses = service.getCoursesOfStudent(student.getId());
        assertTrue(studentCourses.contains(course));

        Set<Student> courseStudents = service.getStudentsInCourse(course.getId());
        assertTrue(courseStudents.contains(student));
    }

    @Test
    void testEnrollUnknownStudentFails() {
        boolean enrolled = service.enrollStudent("invalid-id", course.getId());
        assertFalse(enrolled);
    }

    @Test
    void testEnrollUnknownCourseFails() {
        boolean enrolled = service.enrollStudent(student.getId(), "invalid-id");
        assertFalse(enrolled);
    }

    @Test
    void testMultipleEnrollments() {
        Student bob = service.createStudent("Bob");
        Course physics = service.createCourse("Physics");

        service.enrollStudent(student.getId(), course.getId());
        service.enrollStudent(bob.getId(), course.getId());
        service.enrollStudent(student.getId(), physics.getId());

        assertEquals(2, service.getCoursesOfStudent(student.getId()).size());
        assertEquals(2, service.getStudentsInCourse(course.getId()).size());
    }
}
