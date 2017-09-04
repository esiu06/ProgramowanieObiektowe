package ThreadList;

import java.util.ArrayList;
import java.util.Random;

public class ListThreads implements Runnable{
    private int _counter;
    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _stageTwo = new ArrayList<>();

    private Random rand = new Random();

    private Object stageOneLocker = new Object();
    private Object stageTwoLocker = new Object();

    public void stageOne() throws InterruptedException {
        synchronized (stageOneLocker) {
            _stageOne.add(rand.nextInt());
            Thread.sleep(1);
            _counter++;
        }
    }
    public void stageOTwo() throws InterruptedException {
        synchronized (stageTwoLocker) {
            _stageTwo.add(rand.nextInt());
            Thread.sleep(1);
            _counter++;
        }
    }
    public void proces() throws InterruptedException{
        while (_counter<1000){
            stageOne();
            stageOTwo();
        }
    }

    @Override
    public void run() {
        try {
            proces();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
