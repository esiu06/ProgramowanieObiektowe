package ConsumerProducer;

import java.util.Scanner;

public class Processor {

    public void produce()throws InterruptedException{
        synchronized (this) {
            System.out.println("Prducer thread i running!");
            wait();
            System.out.println("Producer resumed");
        }
    }
    public void consumer()throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("weit for ENTER");
            sc.nextLine();
            notify();
        }

    }
}
