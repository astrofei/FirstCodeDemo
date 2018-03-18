package com.yzf.firstcodedemo.newsprojectdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.yzf.firstcodedemo.R;

/**
 * Created by admin on 2018/3/18.
 */

public class StartActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment);
    }
}
