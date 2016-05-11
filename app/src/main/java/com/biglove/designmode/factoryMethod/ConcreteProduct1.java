package com.biglove.designmode.factoryMethod;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteProduct1 implements IProduct{
    @Override
    public void methodFir() {
        System.out.println("ConcreteProduct1 methodFir execute");
    }

    @Override
    public void methodSec() {
        System.out.println("ConcreteProduct1 methodSec execute");
    }
}
