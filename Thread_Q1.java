class Th3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Done Ho gya");
    }
}

public class Thread_Q1 {
    public static void main(String[] args) {
        Th3 th3 = new Th3();
        Thread thread = new Thread(th3);
        thread.start();
    }
}
