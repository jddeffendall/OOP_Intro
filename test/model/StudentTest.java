package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void enrollCourseShouldBe1() {
        Course aCourse = new Course(5, 210, "Comm", "Public speaking", 3);
        Student aStudent = new Student(3, "Jake");
        aStudent.enrollCourse(aCourse);
        assertEquals(1, aStudent.getEnrolledCourses().size());
    }

    @Test
    void setGradeShouldBeTrue() {
        Course aCourse = new Course(9, 100, "AHS", "Art history", 3);
        Student aStudent = new Student(4, "Mike");
        aStudent.enrollCourse(aCourse);
        assertTrue(aStudent.setGrade(aCourse, 100));
    }

    @Test
    void setGradeShouldBeFalse() {
        Course aCourse = new Course(8, 124, "Discrete", "Discrete structures", 3);
        Student aStudent = new Student(7, "Bob");
        assertFalse(aStudent.setGrade(aCourse, 80));
    }

    @Test
    void GpaShouldBeCorrect() {
        Course aCourse1 = new Course(1, 101, "Art", "Art", 3);
        Course aCourse2 = new Course(2, 102, "Math", "Algebra", 3);
        Student aStudent = new Student(10, "Jeff");
        aStudent.enrollCourse(aCourse1);
        aStudent.enrollCourse(aCourse2);
        aStudent.setGrade(aCourse1, 3.3);
        aStudent.setGrade(aCourse2, 4.0);
        assertEquals(3.65, aStudent.calculateGPA());
    }
}