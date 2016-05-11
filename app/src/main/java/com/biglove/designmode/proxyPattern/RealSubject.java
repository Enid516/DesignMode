package com.biglove.designmode.proxyPattern;

/**
 * 具体主题
 * Created by enid on 2016/5/4.
 */
public class RealSubject implements Subject{
    @Override
    public void operator() {
        System.out.println("realSubject operator execute");
    }
}
