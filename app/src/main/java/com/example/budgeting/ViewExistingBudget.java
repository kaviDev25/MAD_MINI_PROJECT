package com.example.budgeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ViewExistingBudget extends AppCompatActivity {
    //IT19097084 Ayodya Hettiarachchi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_existing_budget);
    }

    public void gotoModify(View next){
        Intent i = new Intent (this, ModifyBudget.class);
        startActivity(i);
    }
}