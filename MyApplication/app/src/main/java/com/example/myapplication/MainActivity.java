package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioGroup myRadioGroup;
    int marks;
    static String value="BMI calculator";
    Spinner mySpinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner=findViewById(R.id.mySpinerID);
        ArrayAdapter<CharSequence> myAdapter=ArrayAdapter.
                createFromResource(this,R.array.DepartmentName,
                        android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(this);
        myRadioGroup=findViewById(R.id.myRadioGroupID);
    }

    public void goFuntion(View view) {
        if(myRadioGroup.getCheckedRadioButtonId()==R.id.bmiCalculator){
            Intent BmI = new Intent(this,MainActivity2.class);
            startActivity(BmI);
        }
        else if(myRadioGroup.getCheckedRadioButtonId()==R.id.converterCalculator){
            Intent Converter = new Intent(this,MainActivity3.class);
            startActivity(Converter);
        }




    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Fragment myfragment;
        if(text.equals("CSE")){
//            load cse
            myfragment=new CSE();
        }else if(text.equals("EEE")){
//            load eee
            myfragment=new EEE();
        }else if(text.equals("BBA")){
//            load bba
            myfragment=new BBA();
        }else{
            myfragment=new BlankFragment();
        }

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentID,myfragment);
        ft.commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Fragment myfragment;
        myfragment=new BlankFragment();


    FragmentManager fm=getSupportFragmentManager();
    FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentID,myfragment);
        ft.commit();
    }

    public void saveFunction(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        myRef.setValue("Hello, World!");
    }
}