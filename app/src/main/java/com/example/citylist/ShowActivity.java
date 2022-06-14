package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView text = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);

        String city_name = getIntent().getStringExtra("city_name");

        if(!city_name.isEmpty())
        {
            text.setText(city_name);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShowActivity.this,MainActivity.class));
                finish();
            }
        });

    }
}