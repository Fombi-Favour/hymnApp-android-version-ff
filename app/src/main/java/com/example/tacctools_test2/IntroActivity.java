package com.example.tacctools_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity {

    private Button buttonEn;
    private Button buttonFr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        buttonEn = (Button) findViewById(R.id.btn_en);
        buttonEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroActivity.this, EnglishPageActivity.class);
                startActivity(intent);
            }
        });

        buttonFr = (Button) findViewById(R.id.btn_fr);
        buttonFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(IntroActivity.this, FrenchPageActivity.class);
                startActivity(intent1);
            }
        });
    }
}