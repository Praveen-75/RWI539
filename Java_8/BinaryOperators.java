package Java_8;


import java.util.function.BinaryOperator;

public class BinaryOperators {
    public static void main(String args[]) {
        BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

        System.out.println("Value of max " + op.apply(98, 11));

        BinaryOperator<Integer> operator = BinaryOperator.minBy((x, y) -> (x > y) ? 1 : ((x == y) ? 0 : -1));
        System.out.println("Value of min " + operator.apply(120, 5));

        BinaryOperator<Integer> operator1 = (x, y) -> x * y;
        System.out.println("Value of multi " + operator1.apply(50, 2));
    }
}

