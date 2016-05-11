package com.biglove.designmode.abstractFactory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 抽象工厂模式
 * Created by enid on 2016/4/28.
 */
public class AbstractFactoryActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TextView(this));
        test();
    }

    private void test() {
        //一级产品
        IFactory factory1 = new ConcreteFactory1();
        IProductA productA1 = factory1.factoryA();
        IProductB productB1 = factory1.factoryB();

        productA1.method1();
        productA1.method2();

        productB1.method1();
        productB1.method2();

        //二级产品
        IFactory factory2 = new ConcreteFactory2();
        IProductA productA2 = factory2.factoryA();
        IProductB productB2 = factory2.factoryB();

        productA2.method1();
        productA2.method2();

        productB2.method1();
        productB2.method2();
    }
}
