package com.example.mobilesoftware1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PendingDelivery extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pendinglist);

        findViewById(R.id.setOngoingbtn).setOnClickListener(v -> setOngoing());
    }
    private void setOngoing(){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Set Ongoing?");
        alertDialog.setMessage("Are you sure you want to start this delivery?\nThis cannot be undone.");
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", (dialogInterface, i) ->
                Toast.makeText(this, "Reset Cancelled", Toast.LENGTH_SHORT).show());
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES", (dialogInterface, i) -> {
            setContentView(R.layout.ongoingdelivery);
            dialogConfirmation("Started Delivery!", "Delivery is now Ongoing");
        });
        alertDialog.show();
    }
    private void dialogConfirmation(String title, String content) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(content);
        builder.setNeutralButton("OK", null);
        builder.show();
    }
}
