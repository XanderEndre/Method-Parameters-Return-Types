package com.example.methodparameters_returntypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInteract(View view) {
        EditText etNumberOne = (EditText) findViewById(R.id.numberOne);
        int firstNumber = Integer.parseInt(etNumberOne.getText().toString());

        EditText etNumberTwo = (EditText) findViewById(R.id.numberTwo);
        int secondNumber = Integer.parseInt(etNumberTwo.getText().toString());

        TextView finalValue = (TextView) findViewById(R.id.finalValue);
        finalValue.setText(Integer.toString(firstNumber + secondNumber));
    }
}