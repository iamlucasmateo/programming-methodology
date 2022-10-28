package Lecture22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parsing {
    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("Lecture22/Albums.txt"));
            ArrayList<Album> albums = createAlbums(br);
            for (Album al: albums) {
                System.out.println(al.toString());
            }
        } catch (FileNotFoundException exc) {
            System.out.println(exc);
        }
    }

    public static ArrayList<Album> createAlbums(BufferedReader reader) {
        ArrayList<Album> albums = new ArrayList<Album>();

        while (true) {
            try {
                String line = reader.readLine();
                if (line == null) break;
                albums.add(parseAlbum(line));
            } catch (IOException exc) {
                System.out.println(exc);
            }
        }

        return albums;
    }

    public static Album parseAlbum(String line) {
        ArrayList<String> albumData = splitString(line, ']');
        if (albumData.size() != 3) {
            throw new Error("The line " + line + " does not make sense.");
        }
        String name = albumData.get(0).trim();
        name = name.substring(1, name.length());
        String band = albumData.get(1).trim();
        band = band.substring(1, band.length());
        int year = Integer.parseInt(albumData.get(2).trim());

        return new Album(name, band, year);
    }

    public static ArrayList<String> splitString(String myString, char myChar) {
        ArrayList<String> result = new ArrayList<String>();
        String oneString = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == myChar) {
                result.add(oneString);
                oneString = "";
            } else {
                oneString += myString.charAt(i);
            }
        }
        result.add(oneString);

        return result;
    }
}
