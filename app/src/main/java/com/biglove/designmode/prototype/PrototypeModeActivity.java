package com.biglove.designmode.prototype;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 原型模式
 * 通过一个原型对象来指明所有创建的对象的类型，然后复制这个原型对象来创造更多的同类型的对象
 * Created by enid on 2016/4/27.
 */
public class PrototypeModeActivity extends Activity{
    private static final String TAG = "PrototypeModeActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Prototype p1 = new ConcretePrototype1();
        p1.setGroupId(1);
        p1.setGroupName("Group1");

        PrototypeManager.setPrototype("p1",p1);

        Prototype copy = null;
        try {
            copy = PrototypeManager.getPrototype("p1").clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        copy.setGroupId(2);
//        copy.setGroupId(2);
//        copy.setGroupName("Group2");

        Log.i(TAG,"copyPrototype id:" + copy.getGroupId() + ",name:" + copy.getGroupName());

    }
}
