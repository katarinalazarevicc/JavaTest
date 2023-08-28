package trainingCentar;

import java.util.ArrayList;

public class Program {
    private String name;
    private int hoursDuration;
    private ArrayList<Course> coursesList;

    public Program(String name) {
        setName(name);
        hoursDuration = 0;
        coursesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }

    public int getDurationInHours() {
        return hoursDuration;
    }

    public void addCourse(Course course) {
        coursesList.add(course);
        hoursDuration += course.getHoursDuration();
    }
}
