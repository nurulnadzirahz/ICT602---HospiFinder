package com.example.hospitalfinder;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        MaterialButton loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the welcome popup
                showWelcomePopup();
            }
        });
    }

    private void showWelcomePopup() {
        // Inflate the layout for the welcome popup
        View view = LayoutInflater.from(this).inflate(R.layout.welcome_popup, null);

        // Create the AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);

        // Create a Button in the popup to dismiss it
        Button btnOk = view.findViewById(R.id.btnOk);
        final AlertDialog alertDialog = builder.create();
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();

                // Navigate to the next page (Homepage)
                Intent intent = new Intent(Login.this, Homepage.class);
                startActivity(intent);
            }
        });

        // Show the popup
        alertDialog.show();
    }
}
