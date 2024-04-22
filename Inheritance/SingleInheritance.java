package Inheritance;


class Demo {
    void demo() {
        System.out.println("Extend karna hai");
    }
}

class Demo2 extends Demo {
    void demo2() {
        System.out.println("Ye extend ho gai");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.demo();
        demo2.demo2();
    }
}
