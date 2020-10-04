package com.example.budgeting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class listBudgets extends AppCompatActivity {
    //IT19097084, Ayodya Hettiarachchi
    //declare elements used
    private FloatingActionButton createNewBudget;


    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_budgets);




        //assign declared elements
        createNewBudget = findViewById(R.id.floatingActionButton);

        //start CreateNewBudget on button click
        createNewBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoCreateNewBudget();
            }
        });
    }

    public void gotoCreateNewBudget(){
        Intent i = new Intent(this, CreateNewBudget.class);
        startActivity(i);
    }
}
