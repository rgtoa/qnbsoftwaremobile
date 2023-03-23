package com.example.mobilesoftware1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class OngoingDelivery extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ongoingdelivery);

        findViewById(R.id.setCompletebtn).setOnClickListener(v -> setCompleted());
    }
    private void setCompleted(){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Set Complete?");
        alertDialog.setMessage("Are you sure you want to finish this delivery?\nThis cannot be undone.");
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", (dialogInterface, i) ->
                Toast.makeText(this, "Completion Cancelled", Toast.LENGTH_SHORT).show());
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES", (dialogInterface, i) -> {
            setContentView(R.layout.completedelivery);
            dialogConfirmation("Finished Delivery!", "Delivery is now Complete");
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
