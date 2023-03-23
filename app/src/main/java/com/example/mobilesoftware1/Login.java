package com.example.mobilesoftware1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        findViewById(R.id.btnLogin).setOnClickListener(v -> LoginValidation());
    }
    private void LoginValidation(){

        // if

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Try again");
        alertDialog.setMessage("The credentials you have entered do not match.");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OKAY", (dialogInterface, i) -> {
            alertDialog.dismiss();

            // else

            setContentView(R.layout.splashscrn);
            Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
        });
        alertDialog.show();


    }
}
