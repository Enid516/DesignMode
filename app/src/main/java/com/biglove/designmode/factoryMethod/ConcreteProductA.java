package com.biglove.designmode.factoryMethod;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteProductA implements IProduct{
    @Override
    public void methodFir() {
        System.out.println("ConcreteProductA methodFir execute");
    }

    @Override
    public void methodSec() {
        System.out.println("ConcreteProductA methodSec execute");
    }
}
