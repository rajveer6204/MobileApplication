package com.example.androidpracticals;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.email);
        EditText phone = findViewById(R.id.phone);
        RadioGroup genderGroup = findViewById(R.id.genderGroup);
        CheckBox java = findViewById(R.id.java);
        CheckBox python = findViewById(R.id.python);
        CheckBox cpp = findViewById(R.id.cpp);

        findViewById(R.id.submit).setOnClickListener(v -> {
            String gender = "Not selected";
            int id = genderGroup.getCheckedRadioButtonId();
            if (id != -1) gender = ((RadioButton)findViewById(id)).getText().toString();

            String languages = "";
            if (java.isChecked()) languages += "Java ";
            if (python.isChecked()) languages += "Python ";
            if (cpp.isChecked()) languages += "C++ ";
            if (languages.isEmpty()) languages = "None";

            String msg = "Name: " + name.getText() +
                    "\nEmail: " + email.getText() +
                    "\nPhone: " + phone.getText() +
                    "\nGender: " + gender +
                    "\nLanguages: " + languages;

            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        });
    }
}
