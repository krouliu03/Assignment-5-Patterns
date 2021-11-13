package com.aleke.alibi;

public class Purchase {
    private Package pack;
    private Inventory invent;
    private Invoice invoice;
    private Email mail;
    
    public Purchase () {
        pack = new Package();
        invent = new Inventory();
        invoice = new Invoice();
        mail = new Email();
    }
    public void purchasing(){
        pack.packaging_sector();
        invent.inv_reduce(25);
        invoice.note_generating();
        mail.sending_Email();
    }
}
