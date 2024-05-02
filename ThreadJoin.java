public class ThreadJoin extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadJoin threadJoin = new ThreadJoin();
        ThreadJoin threadJoin1 = new ThreadJoin();
        ThreadJoin threadJoin2 = new ThreadJoin();
        ThreadJoin threadJoin3 = new ThreadJoin();
        threadJoin.start();
        try {
            threadJoin.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        threadJoin1.start();
        threadJoin2.start();
//        threadJoin3.start();
    }
}
