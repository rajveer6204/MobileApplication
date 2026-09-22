package com.example.androidpracticals;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class CityActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        Spinner spinner = findViewById(R.id.citySpinner);
        String[] cities = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Hyderabad"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_spinner_item, cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        findViewById(R.id.selectButton).setOnClickListener(v ->
                Toast.makeText(this, "Selected City: " + spinner.getSelectedItem(),
                        Toast.LENGTH_SHORT).show());
    }
}
