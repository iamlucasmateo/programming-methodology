package Lecture10;

public class Program {
    public static void main(String[] args) {
        Student student1 = new Student(1234, "Lucas Mateo", 0);
        System.out.println(student1);
        student1.increaseUnits(50);
        System.out.println(student1.getUnits());
        System.out.println(student1.hasDegree());
    }
}
