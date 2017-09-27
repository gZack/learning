package mpp.quiz;

import java.util.ArrayList;

public class Grad extends Student {

    Profile profile;

    public Grad(){
        this.courseList = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course) {
        totalCourseHour += course.totalCourseHour();
        this.courseList.add(course);
    }

}
