import java.util.Scanner;

abstract class AbstractClass {
//    public AbstractClass() {
//        System.out.println("Hello me constructor hu");
//    }

    public void demo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    abstract public void abs();
}

class abs2 extends AbstractClass {
    public void abs() {
        System.out.println("Kya hua");
    }

    public static void main(String[] args) {
        abs2 ac = new abs2();
        ac.demo();
        ac.abs();
    }
}