package com.example.activitytoday;

import static android.service.controls.ControlsProviderService.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is a verbose log");
        Log.d(TAG, "This is a debug log");
        Log.i(TAG, "This is an info log");
        Log.w(TAG, "This is a warn log");
        Log.e(TAG, "This is an error log");

        Button send = (Button) findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button Clicked");
                Intent intent = new Intent(SecondActivity.this, ThirdActivity,this);
                //Intent intel = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

}