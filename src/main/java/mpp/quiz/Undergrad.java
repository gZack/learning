package mpp.quiz;

import java.util.ArrayList;

public class Undergrad extends Student {

    Portfolio portfolio;

    public Undergrad(){
        this.courseList = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course) {
        totalCourseHour += course.totalCourseHour();
        this.courseList.add(course);
    }
}
