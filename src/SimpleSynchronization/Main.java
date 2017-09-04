package SimpleSynchronization;

public class Main {
    public int counter;
    public synchronized void incremment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Main mm = new Main();
        mm.doWork();
    }
    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter++;
                }
            }
        });
        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
