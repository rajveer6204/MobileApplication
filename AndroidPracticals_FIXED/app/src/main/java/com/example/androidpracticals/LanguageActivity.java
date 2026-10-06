package com.example.androidpracticals;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LanguageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        CheckBox java = findViewById(R.id.java);
        CheckBox python = findViewById(R.id.python);
        CheckBox cpp = findViewById(R.id.cpp);

        findViewById(R.id.submit).setOnClickListener(v -> {
            String languages = "";
            if (java.isChecked()) languages += "Java ";
            if (python.isChecked()) languages += "Python ";
            if (cpp.isChecked()) languages += "C++ ";
            if (languages.isEmpty()) languages = "No language selected";

            Toast.makeText(this, "Selected: " + languages,
                    Toast.LENGTH_SHORT).show();
        });
    }
}
