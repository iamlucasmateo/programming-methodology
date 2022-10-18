package Lecture15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        String fileName = "example.txt";
        // String fileName2 = "/home/lucas-mateo/Desktop/CODE/learn/programming-methodology/Lecture15/example.txt";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        FileReader fr = new FileReader(fileName);
        // BufferedReader rd = new BufferedReader(fr);
        // printLines(rd);

    };

    // private static void printLines(BufferedReader rd) {
    //     while (true) {
    //         String line = rd.readLine();
    //         if (line == null) break;
    //         System.out.println(line);
    //     }
    //     rd.close();
    // }

    private static BufferedReader getBufferedReaderFromPrompt() {
        BufferedReader rd = null;
        while (rd == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Filename?");
            String name = scanner.nextLine();
            try {
                rd = new BufferedReader(new FileReader(name));
            } catch (IOException exc) {
                System.out.println("The file " + name + " does not exist");
            } finally {
                scanner.close();
            }
        }
        
        return rd;
    }

}
