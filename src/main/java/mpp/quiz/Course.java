package mpp.quiz;

public class Course implements Graduatable {
    private String courseName;
    private Integer courseHour;

    public Course(String courseName, Integer courseHour){
        this.courseName = courseName;
        this.courseHour = courseHour;
    }

    @Override
    public int totalCourseHour() {
        return courseHour;
    }
}
