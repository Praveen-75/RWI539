import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(345);
        list.add(23);
        System.out.println(list);

        int search = list.get(1);
        System.out.println(search);

        list.add(1, 3);
        System.out.println(list);

        list.set(0, 6);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        Collections.sort(list);
        System.out.println(list);
    }
}
