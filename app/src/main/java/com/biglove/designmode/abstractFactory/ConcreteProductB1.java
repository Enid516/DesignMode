package com.biglove.designmode.abstractFactory;

/**
 * Created by enid on 2016/4/28.
 */
public class ConcreteProductB1 implements IProductB{
    @Override
    public void method1() {
        System.out.println("等级为1的B产品 method1 execute");
    }

    @Override
    public void method2() {
        System.out.println("等级为1的B产品 method2 execute");
    }
}
