package com.biglove.designmode.builder;

/**
 * Created by enid on 2016/4/25.
 */
public class WomanBuilder implements PersonalBuilder{
    @Override
    public void buildHead() {
        System.out.println("开始创建女人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("开始创建女人的身体");
    }

    @Override
    public void buildFoot() {
        System.out.println("开始创建女人的脚");
    }

    @Override
    public Person buildPerson() {
        return null;
    }
}
