package com.example.androidpracticals;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.registrationBtn).setOnClickListener(v ->
                startActivity(new Intent(this, RegistrationActivity.class)));

        findViewById(R.id.loginBtn).setOnClickListener(v ->
                startActivity(new Intent(this, LoginActivity.class)));

        findViewById(R.id.profileBtn).setOnClickListener(v ->
                startActivity(new Intent(this, ProfileActivity.class)));

        findViewById(R.id.cityBtn).setOnClickListener(v ->
                startActivity(new Intent(this, CityActivity.class)));

        findViewById(R.id.languageBtn).setOnClickListener(v ->
                startActivity(new Intent(this, LanguageActivity.class)));
    }
}
