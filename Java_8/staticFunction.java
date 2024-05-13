package Java_8;


import org.w3c.dom.Text;


interface A {
    static void a() {
        System.out.println("Hello");
    }
}

interface B {
    static void a() {
        System.out.println("Hello Kese ho");
    }
}

public class staticFunction implements A, B {
    public static void main(String[] args) {
        staticFunction test = new staticFunction();
        A.a();
        B.a();
    }
}

