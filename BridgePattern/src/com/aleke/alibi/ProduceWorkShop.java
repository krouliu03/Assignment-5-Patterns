package com.aleke.alibi;
import java.util.concurrent.TimeUnit;

public class ProduceWorkShop extends WorkShop{
    public ProduceWorkShop() {
        super();
    }

    @Override
    public void work(ElectronicDevices electronicDevices) {
        System.out.print("Producing --- ");
        long timeToTake = 300 * electronicDevices.workTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {

        }
        System.out.printf("Time taken: %d millis \n", timeToTake);
    }

}
