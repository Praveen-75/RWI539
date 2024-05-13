package Java_8;

interface Interface {
    void abstract_func(int x, int y);

    default void default_Fun() {
        System.out.println("default method");
    }
}

public class LambdaExpressions {
    public static void main(String[] args) {
        Interface obj = (int x, int y) -> System.out.println(x + y);
        System.out.print("The result = ");
        obj.abstract_func(5, 5);
        obj.default_Fun();
    }
}
