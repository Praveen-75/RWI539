import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_list1 {
    public static boolean isUnique(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (list.contains(arr[i]))
                return false;
            else
                list.add(arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 56, 34, 23, 78, 99};
        Arrays.sort(arr);
        if (isUnique(arr)) {
            System.out.println("Array unique hai");
        } else {
            System.out.println("Array unique nhi hai");
        }
    }
}

