package com.biglove.designmode.builder;

/**
 * Created by enid on 2016/4/25.
 */
public interface PersonalBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
