package mpp.quiz;

import java.util.List;

public abstract class Student {
    protected String name;
    protected String id;
    protected int totalCourseHour;
    List<Graduatable> courseList;

    abstract void registerCourse(Course course);

    public String getName() {
        return name;
    }

    public int getTotalCourseHour() {
        return totalCourseHour;
    }

    public String getId() {
        return id;
    }
}
