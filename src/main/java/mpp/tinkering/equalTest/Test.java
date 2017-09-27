package mpp.tinkering.equalTest;

public class Test {
    public static void main(String[] args){
        Point p2d = new Point(1,2);
        Point p3d = new Point3D(1,2,3);

        System.out.println(p2d.equals(p3d));
        System.out.println(p3d.equals(p2d));
    }
}
