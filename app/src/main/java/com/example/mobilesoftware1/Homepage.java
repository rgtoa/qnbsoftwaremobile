package com.example.mobilesoftware1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendinglist);

        findViewById(R.id.btn_pending).setOnClickListener(v -> startActivity(new Intent(this, PendingDelivery.class)));
        findViewById(R.id.btn_ongoing).setOnClickListener(v -> startActivity(new Intent(this, OngoingDelivery.class)));
        findViewById(R.id.btn_complete).setOnClickListener(v -> startActivity(new Intent(this, CompleteDelivery.class)));
        findViewById(R.id.btn_signout).setOnClickListener(v -> startActivity(new Intent(this, SignOut.class)));
    }
}
