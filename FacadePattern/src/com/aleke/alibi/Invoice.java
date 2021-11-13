package com.aleke.alibi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    Date data = new Date();
    SimpleDateFormat formator = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    
    public void note_generating(){
        System.out.println("Generating Invoice for the product on the date time is: " + formator.format(data));
    }
}
