package com.example.secondguidedexercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNameGE2;
    Button btnClickGE2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNameGE2 = findViewById(R.id.etNameGE2);
        btnClickGE2 = findViewById(R.id.btnClickGE2);

        btnClickGE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etNameGE2.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Hello " + name + "\nWelcome to Android Development",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
