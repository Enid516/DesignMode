package com.biglove.designmode.factoryMethod;

/**
 * 抽象工厂类，定义了子类必须实现的createProduct()方法
 * Created by enid on 2016/4/28.
 */
public abstract class Factory {
    //运用了java中的泛型和反射
    public abstract <T extends IProduct> T createProduct(Class<T> c);
}
