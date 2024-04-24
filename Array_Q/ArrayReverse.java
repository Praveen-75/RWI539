package Array_Q;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

}
