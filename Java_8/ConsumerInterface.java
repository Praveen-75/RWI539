package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Praveen Kumar");

        Consumer<List<Integer>> list = li -> {
            for (Integer data : li) {
                System.out.print(data + 10 + " ");
            }
        };
        list.accept(Arrays.asList(1, 2, 3, 4));

        Consumer<List<Integer>> list1 = li -> {
            System.out.println();
            for (Integer data : li) {
                System.out.print(data + " ");
            }
        };
        Consumer<List<Integer>> listConsumer = list.andThen(list1);
        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
    }
}
