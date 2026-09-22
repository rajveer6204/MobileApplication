package com.example.androidpracticals;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.username);

        findViewById(R.id.login).setOnClickListener(v ->
                Toast.makeText(this, "Welcome, " + username.getText().toString(),
                        Toast.LENGTH_SHORT).show());
    }
}
