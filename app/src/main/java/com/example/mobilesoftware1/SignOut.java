package com.example.mobilesoftware1;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SignOut extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        findViewById(R.id.btn_signout).setOnClickListener(v -> LogOut());
        findViewById(R.id.btn_signout1).setOnClickListener(v -> LogOut());
        findViewById(R.id.btn_signout2).setOnClickListener(v -> LogOut());
        findViewById(R.id.btn_signout3).setOnClickListener(v -> LogOut());
    }
    private void LogOut(){
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Going somewhere?");
        alertDialog.setMessage("Are you sure you want to Sign out?");
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", (dialogInterface, i) -> {
            alertDialog.dismiss();
        });
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "YES", (dialogInterface, i) -> {
            setContentView(R.layout.loginpage);
            dialogConfirmation("Sign out", "You have been logged out.");
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
