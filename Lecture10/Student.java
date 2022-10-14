package Lecture10;

public class Student {
    private int id;
    private String name;
    private double units;
    private static final double UNITS_TO_DEGREE = 108.0;

    Student(int id, String name, double units) {
        this.id = id;
        this.name = name;
        this.units = units;
    }

    public double getUnits() {
        return this.units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void increaseUnits(int newUnits) {
        this.units += newUnits;
    }

    public String toString() {
        return "Student " + this.name;
    }

    public boolean hasDegree() {
        return this.units >= UNITS_TO_DEGREE;
    }
}
