package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Result;
    EditText Number1,Number2;
    Button ADD,SUB,MUL,DIV;

    float Result_num;
    int Num1,Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = (TextView)findViewById(R.id.Result);

        Number1 = (EditText)findViewById(R.id.Number1);
        Number2 = (EditText)findViewById(R.id.Number2);

        ADD =(Button)findViewById(R.id.ADD);
        SUB =(Button)findViewById(R.id.SUB);
        MUL =(Button)findViewById(R.id.MUL);
        DIV =(Button)findViewById(R.id.DIV);

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 =Integer.parseInt( Number1.getText().toString());
                Num2 =Integer.parseInt( Number2.getText().toString());
                Result_num = Num1+Num2;
                Result.setText(String.valueOf(Result_num));
            }
        });
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 =Integer.parseInt( Number1.getText().toString());
                Num2 =Integer.parseInt( Number2.getText().toString());
                Result_num = Num1-Num2;
                Result.setText(String.valueOf(Result_num));
            }
        });
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 =Integer.parseInt( Number1.getText().toString());
                Num2 =Integer.parseInt( Number2.getText().toString());
                Result_num = Num1*Num2;
                Result.setText(String.valueOf(Result_num));
            }
        });
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 =Integer.parseInt( Number1.getText().toString());
                Num2 =Integer.parseInt( Number2.getText().toString());
                Result_num = Num1/Num2;
                Result.setText(String.valueOf(Result_num));
            }
        });


    }
}