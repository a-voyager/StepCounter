package com.voyager.stepcounter;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        TabLayout tab = (TabLayout) findViewById(R.id.tab_layout);
        tab.addTab(tab.newTab().setText("标签一"));
        tab.addTab(tab.newTab().setText("标签二"));
        tab.addTab(tab.newTab().setText("标签三"));
        Button btn = (Button) findViewById(R.id.btn_to_home);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


    }
}
