interface A {
    void car();

    void color();

    void brand();
}

abstract class B implements A {
}

class M extends B {
    public void color() {
        System.out.println("Red");
    }

    public void car() {
        System.out.println("Ghar ke liye");
    }

    public void brand() {
        System.out.println("BMW");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        A a = new M();
        a.car();
    }
}
