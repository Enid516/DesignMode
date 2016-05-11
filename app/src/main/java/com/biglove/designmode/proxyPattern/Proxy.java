package com.biglove.designmode.proxyPattern;

/**
 * 代理类
 * Created by enid on 2016/5/4.
 */
public class Proxy implements Subject{
    private Subject subject;
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operator() {
        System.out.println("before operator....");
        subject.operator();
        System.out.println("after operator....");
    }
}
