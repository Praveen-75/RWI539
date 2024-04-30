class GroupThreadConstructor implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }
}


public class Thread_Q3 {
    public static void main(String[] args) {
        GroupThreadConstructor th = new GroupThreadConstructor();
        ThreadGroup threadGroup = new ThreadGroup("Parent Class");
        Thread thread = new Thread(threadGroup, th, "Start");
        thread.start();
        Thread thread1 = new Thread(threadGroup, th, "Ho");
        thread1.start();
        System.out.println(threadGroup.getName());
        threadGroup.list();
        System.out.println(threadGroup.activeCount());
    }
}
