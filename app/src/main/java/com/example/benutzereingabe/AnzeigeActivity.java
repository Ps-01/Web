package com.example.benutzereingabe;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AnzeigeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anzeige);

        // Daten aus dem Intent empfangen
        String name = getIntent().getStringExtra("benutzerName");
        String age = getIntent().getStringExtra("benutzerAlter");

        // TextView anzeigen
        TextView textView = findViewById(R.id.textView);
        textView.setText("Name: " + name + "\nAlter: " + age);
    }
}
