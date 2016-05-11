package com.biglove.designmode.factoryMethod;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteProductB implements IProduct{
    @Override
    public void methodFir() {
        System.out.println("ConcreteProductB methodFir execute");
    }

    @Override
    public void methodSec() {
        System.out.println("ConcreteProductB methodSec execute");
    }
}
