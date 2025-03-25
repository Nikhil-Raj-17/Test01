package com.example.test01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signing_in extends AppCompatActivity {

    private EditText phoneNumberInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signing_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        phoneNumberInput = findViewById(R.id.phone_number_input);
        passwordInput = findViewById(R.id.password_input);
        Button loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = phoneNumberInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (phoneNumber.isEmpty() || password.isEmpty()) {

                    Toast.makeText(signing_in.this, "Please enter phone number and password", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(signing_in.this, opening1.class);
                    startActivity(intent);
                }
            }
        });
    }
}
