import org.junit.Test;
import trainingCentar.Course;
import trainingCentar.Program;
import trainingCentar.Student;

import java.time.LocalDateTime;
import java.time.Month;

public class InputTest {

    @Test(expected = IllegalArgumentException.class)
    public void canStudentFirstNameBeEmpty() {
        Program javaDeveloper = new Program("Java Developer");

        javaDeveloper.addCourse(new Course("Java", 16));
        javaDeveloper.addCourse(new Course("JDBC", 24));
        javaDeveloper.addCourse(new Course("Spring", 16));
        javaDeveloper.addCourse(new Course("Java", 95));

        Student student = new Student("", "Ivanov", javaDeveloper, LocalDateTime.of(2020, Month.JUNE, 7, 10, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canStudentLastNameBeEmpty() {
        Program javaDeveloper = new Program("Java Developer");

        javaDeveloper.addCourse(new Course("Java", 10));
        javaDeveloper.addCourse(new Course("JDBC", 20));
        javaDeveloper.addCourse(new Course("Spring", 10));
        javaDeveloper.addCourse(new Course("Java", 98));

        Student student = new Student("Ivan", "", javaDeveloper, LocalDateTime.of(2020, Month.JUNE, 7, 10, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCourseNameBeEmpty() {
        Course course = new Course("", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canProgramNameBeEmpty() {
        Program program = new Program("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCourseDurationBeZero() {
        Course course = new Course("Java", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void canCourseDurationBeNegative() {
        Course course = new Course("Java", -10);
    }

}
