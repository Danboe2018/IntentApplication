package com.webappclouds.intentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Bundle firstData = getIntent().getExtras();

        if(firstData == null){
            return;
        } else {
            String firstMessage = firstData.getString("firstMessage");
            TextView secondText = findViewById(R.id.secondText);
            secondText.setText(firstMessage);
        }
    }

    public void onClick2(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
