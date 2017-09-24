package temp.lab3.prob3;

import mpp.mpp.lab3.prob3.inherit.Circle;
import mpp.mpp.lab3.prob3.inherit.Cylinder;

public class Main {

    public static void main(String[] args){

        Circle circle = new Circle(7);
        System.out.println("area of actual circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder(7,4);
        System.out.println("are of cylinder: " + cylinder.getArea());
        System.out.println("volume of cylinder: " + cylinder.getVolume()) ;
    }
}
