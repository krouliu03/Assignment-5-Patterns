package com.aleke.alibi;
import java.util.ArrayList;
import java.util.List;

public abstract class ElectronicDevices {
    protected List<WorkShop> workshops = new ArrayList<WorkShop>();

    public ElectronicDevices() {
        super();
    }

    public boolean joinWorkshop(WorkShop workshop) {
        return workshops.add(workshop);
    }

    public abstract void manufacture();

    public abstract int workTime();
}
