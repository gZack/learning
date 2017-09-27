package mpp.tinkering.equalTest;

public class Point {
    private static double version = 1.0;
    private transient double distance;
    private String name;
    private int x, y;
    public Point(String name, int x, int y) {
        this(x,y);
        this.name = name;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        Point point = (Point)other;
        return (
                x == point.x &&
                        y == point.y &&
                        (name == point.name ||
                                (name != null && name.equals(point.name)))
        );
    }
    public int hashCode() {
        return x ^ y;
    }
}
