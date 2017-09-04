package ThreadZadanie1;

public class Runner {
    public static void main(String[] args) {

        Runnable[] runners = new Runnable[10];
        Thread[] threads = new Thread[10];

        runners[0] = new Thread("Paweł");
        runners[1] = new Thread("Damian");
        runners[2] = new Thread("Piotrek");
        runners[3] = new Thread("Kuba");
        runners[4] = new Thread("Jacek");
        runners[5] = new Thread("Marcin");
        runners[6] = new Thread("Krzysiek");
        runners[7] = new Thread("Maciek");
        runners[8] = new Thread("Jurek");
        runners[9] = new Thread("Adam");



    }
}
