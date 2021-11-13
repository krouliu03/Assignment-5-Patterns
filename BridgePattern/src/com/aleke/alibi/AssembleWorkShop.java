package com.aleke.alibi;
import java.util.concurrent.TimeUnit;

public class AssembleWorkShop extends WorkShop {

    public AssembleWorkShop() {
        super();
    }

    @Override
    public void work(ElectronicDevices electronicDevices) {
        System.out.print("Assembling --- ");
        long timeToTake = 200 * electronicDevices.workTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake);
        } catch (InterruptedException exp) {

        }
        System.out.printf("Time taken: %d millis \n", timeToTake);
    }

}