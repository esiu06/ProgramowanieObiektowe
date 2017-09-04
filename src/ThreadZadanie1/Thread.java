package ThreadZadanie1;

public class Thread implements Runnable {
    private String _name;

    public Thread(String name){
        _name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello %s\n", _name);
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Goodbay from Thread");
    }
}
