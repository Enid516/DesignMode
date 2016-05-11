package com.biglove.designmode.builder;

import android.app.Activity;
import android.os.Bundle;

/**
 * 构建者模式：将一个对象的构建和表示分离，使同样的构造过程可以构建出不同的表示
 * Created by enid on 2016/4/25.
 */
public class BuilderModeActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test();
    }

    private void test(){
        PersonDirector pd = new PersonDirector();
        pd.constructPerson(new ManBuilder());
        pd.constructPerson(new WomanBuilder());
    }
}
