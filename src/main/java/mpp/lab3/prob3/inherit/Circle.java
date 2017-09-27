package mpp.lab3.prob3.inherit;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){};
    public Circle(final double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "This is circle.";
    }
}
