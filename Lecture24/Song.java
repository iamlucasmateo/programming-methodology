package Lecture24;

public class Song {
    private String name;
    private String band;
    private double price;
    private int id;
    private static int lastId = 0;
    
    Song(String name, String band) {
        this.name = name;
        this.band = band;
        lastId += 1;
        this.id = lastId;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public double getPrice () {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getBand() {
        return this.band;
    }

    public int getId() {
        return this.id;
    }

}
