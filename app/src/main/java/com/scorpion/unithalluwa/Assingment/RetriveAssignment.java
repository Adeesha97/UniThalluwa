package com.scorpion.unithalluwa.Assingment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.scorpion.unithalluwa.R;

public class RetriveAssignment extends AppCompatActivity {

    //create a new object for the button
    Button addBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive_assignment);

        //assign it to what we want
        addBtn = findViewById(R.id.AddNewAsBtn);

        //click event
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(),AddAssignment.class);
                startActivity(i);
            }
        });
    }

}
