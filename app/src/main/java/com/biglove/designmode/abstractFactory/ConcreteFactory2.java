package com.biglove.designmode.abstractFactory;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteFactory2 implements IFactory{
    @Override
    public IProductA factoryA() {
        return new ConcreteProductA2();
    }

    @Override
    public IProductB factoryB() {
        return new ConcreteProductB2();
    }
}
