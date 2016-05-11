package com.biglove.designmode.prototype;

/**
 * 具体原型角色
 * Created by enid on 2016/4/27.
 */
public class ConcretePrototype2 implements Prototype{
    private int groupId;
    private String groupName;


    @Override
    public Prototype clone() {
        ConcretePrototype2 prototype2 = new ConcretePrototype2();
        prototype2.setGroupId(this.groupId);
        prototype2.setGroupName(this.groupName);
        return prototype2;
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
