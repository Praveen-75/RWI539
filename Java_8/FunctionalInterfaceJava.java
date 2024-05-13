package Java_8;

@FunctionalInterface
interface FuncInterface {
    String getName();

    default void sum() {
        System.out.println("Hello");
    }

    default void sum1() {
        System.out.println("Java");
    }
}

public class FunctionalInterfaceJava {
    public static void main(String[] args) {
        FuncInterface emp = () -> "Praveen";
        System.out.println(emp.getName());
        emp.sum();
        emp.sum1();
    }
}

