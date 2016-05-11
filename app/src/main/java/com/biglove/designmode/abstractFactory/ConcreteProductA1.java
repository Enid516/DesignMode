package com.biglove.designmode.abstractFactory;

/**
 * 等级为1的A产品
 * Created by enid on 2016/4/28.
 */
public class ConcreteProductA1 implements IProductA{
    @Override
    public void method1() {
        System.out.println("等级为1的A产品 method1 execute");
    }

    @Override
    public void method2() {
        System.out.println("等级为1的A产品 method2 execute");
    }
}
