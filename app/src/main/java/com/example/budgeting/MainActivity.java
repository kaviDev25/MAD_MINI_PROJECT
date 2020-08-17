package com.example.budgeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //IT19097084, Ayodya Hettiarachchi
    ListView budgetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        budgetsList = (ListView)findViewById(R.id.budgetsList);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Travel Budget");
        arrayList.add("Discretionary Spending");
        arrayList.add("Utilities - June");
        arrayList.add("House Redecoration Budget");
        arrayList.add("Pet");
        arrayList.add("Personal Care");
        arrayList.add("Recreational Activities");
        arrayList.add("Necessities");
        arrayList.add("Other Anticipated Expenses");
        arrayList.add("Property Upgrades");
        arrayList.add("Furniture Upgrades");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        budgetsList.setAdapter(arrayAdapter);
    }

    public void gotoCreateNewBudget(View next){
        Intent i = new Intent (this, CreateNewBudget.class);
        startActivity(i);
    }


}