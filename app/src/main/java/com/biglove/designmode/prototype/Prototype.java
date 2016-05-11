package com.biglove.designmode.prototype;

/**
 * 抽象原型角色
 * Created by enid on 2016/4/27.
 */
public interface Prototype {
    /**
     * 克隆自身的方法
     * @return      一个从自身克隆出来的对象
     */
    Prototype clone();//浅度克隆

    int getGroupId();

    void setGroupId(int id);

    String getGroupName();

    void setGroupName(String groupName);
}
