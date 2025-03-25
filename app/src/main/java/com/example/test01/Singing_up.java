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

public class Singing_up extends AppCompatActivity {

    private EditText nameInput;
    private EditText phoneInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_singing_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nameInput = findViewById(R.id.name_input);
        phoneInput = findViewById(R.id.phone_input);
        passwordInput = findViewById(R.id.password_input);

        Button loginButton = findViewById(R.id.signup_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString().trim();
                String phone = phoneInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (name.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                    Toast.makeText(Singing_up.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Singing_up.this, opening1.class);
                    startActivity(intent);
                }
            }
        });
    }
}
