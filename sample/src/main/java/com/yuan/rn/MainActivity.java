package com.yuan.rn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yuan.rn.fuctions.base.TestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(TestActivity.class);
    }

    public void onClickProps(View view){

    }

    public void onClickStyles(View view){

    }

    public void onClickFlexbox(View view){

    }

    public void onClickBaseWidget(View view){

    }

    public void onClickNetwork(View view){

    }

    public void onClickNavigator(View view){

    }

    public void onClickAdvance(View view){

    }


    private void startActivity(Class<?> cls){
        startActivity(new Intent(this,cls));
    }
}
