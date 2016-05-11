package com.biglove.designmode.prototype;

/**
 * 具体原型角色
 * Created by enid on 2016/4/27.
 */
public class ConcretePrototype1 implements Prototype{
    private int groupId;
    private String groupName;

    @Override
    public Prototype clone() {
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        prototype1.setGroupId(this.groupId);
        prototype1.setGroupName(this.groupName);
        return prototype1;
    }

    @Override
    public int getGroupId() {
        return this.groupId;
    }

    @Override
    public void setGroupId(int id) {
        this.groupId = id;
    }

    @Override
    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
