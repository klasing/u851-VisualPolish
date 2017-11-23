package com.example.visualpolish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView colorAndFont = (TextView) findViewById(R.id.colorAndFont);

        assert colorAndFont != null;
        colorAndFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this, ColorFontActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
