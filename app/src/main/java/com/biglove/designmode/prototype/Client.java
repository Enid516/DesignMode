package com.biglove.designmode.prototype;

/**
 * Created by enid on 2016/4/27.
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype operation() {
        Prototype copy = (Prototype) prototype.clone();
        return copy;
    }
}
