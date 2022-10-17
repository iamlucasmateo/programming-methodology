package Lecture11;

public class Person {
    // if this were private, the subclasses wouldn't be able to access these attributes
    // to try it, change them and run Program.java
    protected String name;
    protected int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "This person is named " + this.name + " having " + age + " years.";
    }
}
