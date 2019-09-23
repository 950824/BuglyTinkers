package com.example.buglytinkers;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BugActivity extends AppCompatActivity {

    TextView value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);
        value = findViewById(R.id.value);
        findViewById(R.id.valueBut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value.setText(1/0);
            }
        });
    }
}
