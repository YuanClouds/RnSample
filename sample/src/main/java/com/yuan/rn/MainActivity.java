package com.yuan.rn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(TestActivity.class);
    }

    private void startActivity(Class<?> cls){
        startActivity(new Intent(this,cls));
    }
}
