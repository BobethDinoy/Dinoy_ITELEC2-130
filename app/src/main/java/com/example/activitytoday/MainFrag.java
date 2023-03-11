package com.example.activitytoday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentTransaction;

import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFrag extends AppCompatActivity {

    Button FragA, FragB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frag);

        FragA = (Button) findViewById(R.id.fA);
        FragB = (Button) findViewById(R.id.fB);

        FragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FragA());
            }
        });

        FragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FragB());
            }
        });
        public void loadFragment(Fragment fragment) {
            
            FragmentManager fa = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fa.beginTransaction();

            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit();
        }
    }
}