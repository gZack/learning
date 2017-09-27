package mpp.lab3.prob3.inherit;

public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder(){
        super();
    }

    public Cylinder(final double radius){
        super(radius);
    }

    public Cylinder(final double radius, final double height){
        super(radius);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()*getHeight();
    }

    @Override
    public String toString() {
        return String.format("Area of cylinder: ");
    }
}
