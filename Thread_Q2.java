class GroupThreadConstructor1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
    }
}

public class Thread_Q2 {
    public static void main(String[] args) {
        GroupThreadConstructor1 th = new GroupThreadConstructor1();
        System.out.println(th.isAlive());
        th.start();
    }
}
