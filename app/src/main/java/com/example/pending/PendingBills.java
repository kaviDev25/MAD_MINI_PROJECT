package com.example.pending;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PendingBills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_bills);

        String BillCategory [] = {"Water Bill", "Credit card"};
    }
}