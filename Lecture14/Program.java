package Lecture14;

public class Program {
    public static void main(String[] args) {
        double x1 = 3;
        Point point1 = new Point(x1, 8);
        System.out.println(point1);
        x1 = 5;
        // because ints are passed by value, point1 will not have changed
        System.out.println(point1);
        Point point2 = new Point(5, 3);
        Line line = new Line(point1, point2);
        System.out.println(line.toString());
        point1.move(1, 1);
        // because objects are passed by reference, line will have different values
        System.out.println(line);
    }
}
