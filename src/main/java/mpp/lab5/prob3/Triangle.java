package mpp.lab5.prob3;

public final class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(final double base, final double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5*base*height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
