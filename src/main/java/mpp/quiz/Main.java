package mpp.quiz;

public class Main {
    public static void main(String[] args){

        Student underGrad = new Undergrad();
        Course course = new Course("mpp",4);
        underGrad.registerCourse(course);
        course = new Course("fpp",4);
        underGrad.registerCourse(course);
        course = new Course("wap",5);
        underGrad.registerCourse(course);
        course = new Course("ea",10);
        underGrad.registerCourse(course);

        System.out.println("undergrad courses: " + underGrad.getTotalCourseHour());



    }
}
