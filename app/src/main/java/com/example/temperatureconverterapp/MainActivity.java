package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_CtoF,button_FtoC;
    TextView textView_name,textView_result;
    EditText editText_Temp;
    double textView_result0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_CtoF = findViewById(R.id.CtoF);
        button_FtoC = findViewById(R.id.FtoC);
        textView_name = findViewById(R.id.name);
        textView_result = findViewById(R.id.result);
        editText_Temp = findViewById(R.id.Temp);
        button_CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(editText_Temp.getText().toString());
                textView_result0 = (temp * 1.8) + 32;

                textView_result.setText(String.valueOf(textView_result0));



            }
        });
        button_FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(editText_Temp.getText().toString());
                textView_result0 = (temp - 32) / 1.8;

                textView_result.setText(String.valueOf(textView_result0));



            }
        });
    }
}