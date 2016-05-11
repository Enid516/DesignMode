package com.biglove.designmode.proxyPattern;

import android.app.Activity;
import android.os.Bundle;

/**
 * 代理模式(为其他对象提供一种代理，以控制对这个对象的访问，使用代理使用代理模式产生代理对象，让代理对象控制目标对象
 * 的访问)
 * Created by enid on 2016/5/4.
 */
public class ProxyPatternActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test();
    }

    private void test(){
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.operator();
    }
}
