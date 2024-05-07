package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteTxt {
    public static void main(String[] args) throws IOException {
        Kills kills = new Kills();
        File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\PK.txt");
        FileWriter fw = new FileWriter(String.valueOf(kills));
        Scanner sc = new Scanner(System.in);
        System.out.println("Input txt");
        String s = sc.nextLine();
        fw.write(s);
        fw.close();

        FileReader fr = new FileReader(String.valueOf(kills));
        StringBuilder data = new StringBuilder();
        int d;
        while ((d = fr.read()) != -1) {
            data.append((char) d);
        }
        System.out.println(data);
    }
}
