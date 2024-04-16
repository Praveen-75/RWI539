import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();
        do {
            System.out.println("Number " + n);
            n++;
        } while (n < 0);
    }
}
