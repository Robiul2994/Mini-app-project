package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    RadioGroup myRadioGrop3;
    TextView resultView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        myRadioGrop3= findViewById(R.id.myRadioGroupID3);
        resultView2=findViewById(R.id.result2);
    }

    public void submitFunction2(View view) {
        if (myRadioGrop3.getCheckedRadioButtonId()==R.id.radioBtn22){
            resultView2.setText(""+ "Right");
        }
        else {
            resultView2.setText(""+ "Wrong");
        }
    }

    public void homeFunction3(View view) {
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);
    }
}