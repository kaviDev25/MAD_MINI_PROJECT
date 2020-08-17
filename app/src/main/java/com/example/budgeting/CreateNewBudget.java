package com.example.budgeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateNewBudget extends AppCompatActivity {
    //IT19097084 Ayodya Hettiarachchi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_budget);
    }

    public void gotoViewExistingBudget(View next){
        Intent i = new Intent (this, ViewExistingBudget.class);
        startActivity(i);
    }
}