package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity3 extends AppCompatActivity {
    RadioGroup myRadioGrop2;
    TextView resultView,textvieW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        myRadioGrop2= findViewById(R.id.myRadioGroupID2);
        resultView=findViewById(R.id.result);
    }

    public void submitFunction(View view) {
//        boolean status=false;



        Toast.makeText(this, "Result Save on Database", Toast.LENGTH_SHORT).show();
        if (myRadioGrop2.getCheckedRadioButtonId()==R.id.radioBtn3){
            resultView.setText(""+ "Right");
//            status=true;

        }
        else {
            resultView.setText(""+ "Wrong");
        }
//        String Quiz1 = "1";
//
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("QuizInfo");
//        myRef.child(Quiz1).child("Correct Ans:").setValue("11");
//        myRef.child(Quiz1).child("Answer Status").setValue(status);



    }

    public void homeFunction2(View view) {
        Intent home = new Intent(this,MainActivity.class);
        startActivity(home);

    }

    public void nextFunction(View view) {
        Intent quiz2 = new Intent(this,MainActivity4.class);
        startActivity(quiz2);
    }
}