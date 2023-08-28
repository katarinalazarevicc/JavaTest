package trainingCentar;

public class Course {
    private String name;
    private int hoursDuration;

    public Course(String name, int hoursDuration) {
        setName(name);
        setHoursDuration(hoursDuration);
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

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        if (hoursDuration < 1) {
            throw new IllegalArgumentException();
        } else {
            this.hoursDuration = hoursDuration;
        }
    }
}
