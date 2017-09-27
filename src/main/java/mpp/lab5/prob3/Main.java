package mpp.lab5.prob3;

public class Main {
    public static void main(String[]  args){
        Shape[] shapes = {new Circle(4),
                new Rectangle(4,5),
                new Triangle(10,5)};

        double totalArea = 0.0;
        for (Shape s:shapes
             ) {
            totalArea += s.computeArea();
        }

        System.out.println("Total computeArea: " + totalArea);
    }
}
