package mpp.lab5.prob3;

public final class Circle implements Shape {

    private final double radius;

    public Circle(final double radius){
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return 3.14*radius*radius;
    }

    public double getRadius() {
        return radius;
    }
}
