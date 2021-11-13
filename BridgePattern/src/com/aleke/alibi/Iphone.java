package com.aleke.alibi;
public class Iphone extends ElectronicDevices{
    @Override
    public void manufacture() {
        System.out.println("=====Manufactoring Iphone=====");
        workshops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Ready for use.");
        System.out.println();
    }

    @Override
    public int workTime() {
        return 5;
    }
}
