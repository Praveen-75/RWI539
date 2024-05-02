public class ThreadYield extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " My Thread");
        }
    }

    public static void main(String[] args) {
        ThreadYield threadYield = new ThreadYield();
        ThreadYield threadYield1 = new ThreadYield();
        threadYield.start();
        for (int i = 1; i <= 5; i++) {
//            threadYield.yield();
            System.out.println(Thread.currentThread().getName() + " Ho gya");
        }
        threadYield1.start();
    }
}
