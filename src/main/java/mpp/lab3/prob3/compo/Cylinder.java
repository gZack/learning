package temp.lab3.prob3.compo;

import mpp.mpp.lab3.prob3.compo.Circle;

public class Cylinder {

    private mpp.mpp.lab3.prob3.compo.Circle circle;

    private double height = 1.0;

    public Cylinder(final Circle circle, final double height){
        this.circle = circle;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return circle.getArea() * this.getHeight();
    }
}
