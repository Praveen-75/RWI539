package FileHandling;

import java.io.File;
import java.util.Scanner;

public class showFile {
    public void printFileNames(File[] arr, int i, int lvl) {
        if (i == arr.length) {
            return;
        }
        if (arr[i].isFile()) {
            System.out.println(arr[i].getName());
        }
        printFileNames(arr, i + 1, lvl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name");
        String fileName = sc.nextLine();
        String path = "C:\\Users\\Lenovo\\OneDrive\\Desktop\\" + fileName;
        File file = new File(path);
        showFile obj = new showFile();
        if (file.exists() && file.isDirectory()) {
            File[] arr = file.listFiles();
            System.out.println("Files from the directory : " + file);
            obj.printFileNames(arr, 0, 0);
        }
    }
}
