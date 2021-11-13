package com.aleke.alibi;
import java.util.concurrent.TimeUnit;

public class TestWorkShop extends WorkShop {

    public TestWorkShop() {
        super();
    }

    @Override
    public void work(ElectronicDevices electronicDevices) {
        System.out.print("Testing --- ");
        long timeToTake = 50 * electronicDevices.workTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {

        }
        System.out.printf("Time taken: %d millis \n", timeToTake);
    }
}