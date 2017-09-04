package SimpleThread;

public class MyRun {
    private  int _id;
    public  MyRun (int id){
        _id = id;
    }
//    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.printf("Hello from thread %d\n", _id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
