package mpp.lab5.prob3;

public final class Rectangle implements Shape{

    private final double width;
    private final double height;

    public Rectangle(final double width, final double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return width*height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
