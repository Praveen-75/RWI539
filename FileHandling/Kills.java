package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Kills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name");
        String file = sc.nextLine();
        String path = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\" + file;
        File f = new File(path);
        try {
            if (f.createNewFile()) {
                System.out.println("File Successfully Create");
            } else {
                System.out.println("File Already exist..");
            }

        } catch (IOException i) {
            System.out.println("Exception Handled..!");
        }
    }
}
