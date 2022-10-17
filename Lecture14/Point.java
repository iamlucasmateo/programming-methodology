package Lecture14;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "Point with x = " + this.x + " and y = " + this.y;
    }
}
