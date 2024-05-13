package Java_8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Carrot");
        list.add("Potato");
        list.add("Cauliflower");
        list.add("LadyFinger");
        list.add("Tomato");
        list.forEach(ans -> System.out.println(ans));
    }
}