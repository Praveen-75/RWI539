public class ExceptionInterrupted extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }

    public static void main(String[] args) {
        ExceptionInterrupted exceptionInterrupted = new ExceptionInterrupted();
        exceptionInterrupted.start();
        exceptionInterrupted.interrupt();
    }
}
