package Array_Q;

import java.util.Scanner;

public class searchElement {
    public static void searchElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 44, 56, 35, 67, 98};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        int n = sc.nextInt();
        for (int j : arr) {
            if (j == n) {
                System.out.println("Mil gya");
                break;
            } else {
                System.out.println("nhi mila");
                break;
            }
        }
    }

    public static void main(String[] args) {
        searchElement();
    }
}
