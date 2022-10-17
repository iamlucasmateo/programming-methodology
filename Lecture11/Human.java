package Lecture11;

public class Human extends Person implements Eats, Dreams {
    private boolean isReptilian;

    Human(String name, int age, boolean isReptilian) {
        super(name, age);
        this.isReptilian = isReptilian;
    }

    public boolean isHerbivore() {
        if (this.age > 50) {
            return true;
        }
        return false;
    }

    public void tellMe() {
        System.out.println("This is my dream");
    }
    
}
