package Java_8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperators {
    public static void main(String[] args) {
        UnaryOperator<Integer> xor = a -> a ^ 1;
        UnaryOperator<Integer> and = a -> a & 1;
        Function<Integer, Integer> compose = xor.compose(xor);
        Function<Integer, Integer> compose1 = xor.compose(and);
        System.out.println(compose.apply(231));
        System.out.println(compose1.apply(231));
    }
}
