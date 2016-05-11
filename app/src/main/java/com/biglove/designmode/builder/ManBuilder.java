package com.biglove.designmode.builder;

/**
 * Created by enid on 2016/4/25.
 */
public class ManBuilder implements PersonalBuilder{
    @Override
    public void buildHead() {
        System.out.println("开始创建男人的头");
    }

    @Override
    public void buildBody() {
        System.out.println("开始创建男人的身体");
    }

    @Override
    public void buildFoot() {
        System.out.println("开始创建男人的脚");
    }

    @Override
    public Person buildPerson() {
        return null;
    }
}
