package Lecture22;

public class Album {
    private String name;
    private String band;
    private int year;

    Album(String name, String band, int year) {
        this.name = name;
        this.band = band;
        this.year = year;
    }

    public String toString() {
        String result = this.name + " - " + this.band + " (" + year + ")";
        return result;
    }

}
