package Lecture11;

public class Student extends Person {
    // this must be defined (even if it doesn't change the parent)
    Student(String name, int age) {
        super(name, age);
    }

    // method override
    public String toString() {
        return "This student is named " + this.name;
    }
    
}
