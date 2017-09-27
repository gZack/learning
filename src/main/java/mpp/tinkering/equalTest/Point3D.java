package mpp.tinkering.equalTest;

public class Point3D extends Point {
    private int z;
    public Point3D(String name, int x, int y, int z) {
        super(name,x,y);
        this.z = z;
    }
    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        Point3D point = (Point3D)other;
        return (z == point.z);
    }
    public int hashCode() {
        return super.hashCode() ^ z;
    }
}
