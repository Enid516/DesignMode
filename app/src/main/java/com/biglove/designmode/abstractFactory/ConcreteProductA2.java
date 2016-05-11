package com.biglove.designmode.abstractFactory;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteProductA2 implements IProductA{
    @Override
    public void method1() {
        System.out.println("等级为2的A产品 method1 execute");
    }

    @Override
    public void method2() {
        System.out.println("等级为2的A产品 method2 execute");
    }
}
