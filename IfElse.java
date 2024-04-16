import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Number are equal");
        } else {
            System.out.println("Number are not equal");
        }
    }
}
