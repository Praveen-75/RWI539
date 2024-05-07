package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class renameFile {
    public static void main(String[] args) throws Exception {
//        File file = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\praveen.txt");
//        File file2 = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\ok.txt");
//
//        if (file2.exists())
//            throw new IOException("file exists");
//        boolean success = file.renameTo(file2);
//
//        if (!success) {
//            System.out.println("File was not successfully renamed");
//        } else {
//            System.out.println("File successfully renamed");
//        }
        Path file = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\praveen.txt");
        Files.move(file, file.resolveSibling("C:\\Users\\Lenovo\\OneDrive\\Desktop\\pk.txt"));
    }
}
