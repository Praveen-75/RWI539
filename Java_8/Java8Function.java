package Java_8;


import java.util.function.Function;

public class Java8Function {
    public static void main(String[] args) {
        Function<String, Integer> fun = x -> x.length();
        Integer apply = fun.apply("Praveen");
        System.out.println(apply);

        Function<String, String> fun1 = x -> x.toUpperCase();
        String ap = fun1.apply("Praveen");
        System.out.println(ap);
    }
}
