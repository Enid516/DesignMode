package com.biglove.designmode.builder;

/**
 * Created by enid on 2016/4/25.
 */
public class PersonDirector {
    public Person constructPerson(PersonalBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
