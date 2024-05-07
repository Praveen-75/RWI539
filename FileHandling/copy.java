package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) throws Exception {
        try (FileInputStream read = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\pk.txt");
             FileOutputStream writeCopy = new FileOutputStream("C:\\Users\\Lenovo\\OneDrive\\Desktop\\ok.txt")) {

            int i;
            while ((i = read.read()) != -1) {
                writeCopy.write(i);
            }

            System.out.println("Data copied successfully");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}