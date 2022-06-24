package com.example.googlelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating button
        Button btn_next;
        btn_next = findViewById(R.id.btn_next);

        //creating intent
        Intent nextscreen;
        nextscreen = new Intent(MainActivity.this, welcomeHome.class);

        //creating on click list-ner
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextscreen);
            }
        });
    }
}