package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.GetByDocumentIdRequest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText heightInsert,weightInsert;
    TextView bmiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bmiTextView = findViewById(R.id.bmiOutput);


        heightInsert = findViewById(R.id.weightInsert);
        weightInsert= findViewById(R.id.hightInsert);

    }



    public void calculateBmi(View view) {

        double calculate=Double.parseDouble(weightInsert.getText().toString())/ Double.parseDouble(heightInsert.getText().toString());
        bmiTextView.setText(""+calculate);
        Toast.makeText(this, "Success" , Toast.LENGTH_SHORT).show();

    }


    public void homeFunction(View view) {
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}