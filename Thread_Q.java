class Th extends Thread {
    public void run() {
        System.out.println("Ho gya");
    }
}

class Th2 extends Thread {
    public void run2() {
        System.out.println("Done Ho gya");
    }
}

public class Thread_Q {
    public static void main(String[] args) {
        Th th = new Th();
        th.run();
        Th2 th2 = new Th2();
        th2.run2();
    }
}
