package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IfoFiles {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name");
        String file = sc.nextLine();
        String path = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\" + file;
        File f = new File(path);
        if (f.exists()) {
//            System.out.println("File Name =" + f.getName());
            System.out.println("File Path=" + f.getAbsolutePath());
//            System.out.println("File write =" + f.canWrite());
            System.out.println("File length =" + f.length());
//            System.out.println("File Read =" + f.canRead());
            System.out.println("File Remove =" + f.delete());

        } else {
            System.out.println("File does not exist");
        }
    }
}
