package Lecture14;

public class Line {
    private Point point1;
    private Point point2;
    
    Line(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public String toString() {
        return "Line with point1 = " + this.point1.toString() + " and point2 = " + this.point2.toString(); 
    }
}
