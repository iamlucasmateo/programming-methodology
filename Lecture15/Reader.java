package Lecture15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class Reader {
    public static void main(String[] args) {
        String fileName = "Lecture15/example.txt";
        
        File file = new File(fileName);
        System.out.println(file.canRead());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        FileReader fr;
        try {
            fr = new FileReader(fileName);
        } catch (Exception exc) {
            System.out.println(exc);
            return;
        }
        BufferedReader fileScanner = new BufferedReader(fr);
        printLines(fileScanner);
        try {
            fileScanner.close();
        } catch (IOException exc) {
            System.out.println(exc);
        }
        // fr.close();

    };

    private static void printLines(BufferedReader br) {
        while (true) {
            try {
                String line = br.readLine();
                if (line == null) break;
                System.out.println(line);
            } catch(IOException e) {
                System.out.println(e);
                break;
            }
        }
    }

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
