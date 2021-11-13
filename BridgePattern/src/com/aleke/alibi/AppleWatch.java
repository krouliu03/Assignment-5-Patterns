package com.aleke.alibi;
public class AppleWatch extends ElectronicDevices{
    @Override
    public void manufacture() {
        System.out.println("=====Manufactoring Apple Watch=====");
        workshops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Ready for use.");
        System.out.println();
    }

    @Override
    public int workTime() {
        return 20;
    }
}
