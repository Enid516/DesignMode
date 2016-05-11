package com.biglove.designmode.factoryMethod;

import android.app.Activity;
import android.os.Bundle;

/**
 * 工厂方法模式:定义一个用于创建对象的接口IFactory,在具体ConcreteFactory子类中根据传进的参数即具体子类ConcreteProduct
 * 决定实例化哪一个IProduct产品，该模式使得一个类（IProduct）的实例化延迟到其子类（ConcreteProduct）
 * Created by enid on 2016/4/28.
 */
public class FactoryMethodActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test();
    }

    private void test(){
        Factory factory = new ConcreteFactory();

        IProduct productA = factory.createProduct(ConcreteProductA.class);
        IProduct productB = factory.createProduct(ConcreteProductB.class);

        productA.methodFir();
        productA.methodSec();

        productB.methodFir();
        productB.methodSec();
    }
}
