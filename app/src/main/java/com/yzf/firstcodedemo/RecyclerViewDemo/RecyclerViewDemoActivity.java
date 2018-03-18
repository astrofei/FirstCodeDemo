package com.yzf.firstcodedemo.RecyclerViewDemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yzf.firstcodedemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2018/3/18.
 */

public class RecyclerViewDemoActivity extends Activity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        initFruits();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 20; i++) {
            Fruit apple = new Fruit("apple");
            fruitList.add(apple);
            Fruit banana = new Fruit("banana");
            fruitList.add(banana);
            Fruit orange = new Fruit("orange");
            fruitList.add(orange);
            Fruit watermelon = new Fruit("watermelon");
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear");
            fruitList.add(pear);
        }
    }
}
