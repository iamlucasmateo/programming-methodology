package Lecture24;

public class Program {
    public static void main(String[] args) {
        Song first = new Song("Ticket to Ride", "The Beatles");
        System.out.println(first.getId());
        Song second = new Song("Money", "Pink Floyd");
        System.out.println(second.getId());
    }
}
