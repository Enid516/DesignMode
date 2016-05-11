package com.biglove.designmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.biglove.designmode.abstractFactory.AbstractFactoryActivity;
import com.biglove.designmode.builder.BuilderModeActivity;
import com.biglove.designmode.factoryMethod.FactoryMethodActivity;
import com.biglove.designmode.prototype.PrototypeModeActivity;
import com.biglove.designmode.proxyPattern.ProxyPatternActivity;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview = (ListView) findViewById(R.id.listview);
        SimpleAdapter adapter = new SimpleAdapter(this,getDataList(),android.R.layout.simple_list_item_1,new String[]{"name"},new int[]{android.R.id.text1});
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"click:" + position,Toast.LENGTH_SHORT);
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, BuilderModeActivity.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, PrototypeModeActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, FactoryMethodActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, AbstractFactoryActivity.class);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, ProxyPatternActivity.class);
                        break;
                    default:
                        break;
                }
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });
    }


    private List<HashMap<String,String>> getDataList(){
        List<HashMap<String,String>> dataList = new ArrayList<HashMap<String, String>>();
        HashMap<String,String> map1 = new HashMap<String, String>();
        map1.put("pattern","builder");
        map1.put("name","建造者模式");
        dataList.add(map1);

        HashMap<String,String> map2 = new HashMap<String, String>();
        map2.put("pattern","prototype");
        map2.put("name","原型模式");
        dataList.add(map2);

        HashMap<String,String> map3 = new HashMap<String, String>();
        map3.put("pattern","factoryMethod");
        map3.put("name","工厂方法模式");
        dataList.add(map3);

        HashMap<String,String> map4 = new HashMap<String, String>();
        map4.put("pattern","abstractFactory");
        map4.put("name","抽象工厂模式");
        dataList.add(map4);


        HashMap<String,String> map5 = new HashMap<String, String>();
        map5.put("pattern","proxy");
        map5.put("name","代理模式");
        dataList.add(map5);
        return dataList;
    }
}
