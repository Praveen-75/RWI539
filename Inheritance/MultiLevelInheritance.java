package Inheritance;

import java.lang.*;

class One {
    public void print1() {
        int n = 10;
        int n2 = 12;
        if (n == n2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

class Two extends One {
    public void print2() {
        String s = "Hello";
        String s2 = "Kya hai";
        System.out.println(s.equals(s2));
    }
}

class Three extends Two {
    public void print3() {
        System.out.println("Geeks");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        Three three = new Three();
        three.print1();
        three.print2();
        three.print3();
    }
}
