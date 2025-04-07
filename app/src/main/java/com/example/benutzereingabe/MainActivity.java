package com.example.benutzereingabe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenzieren der Views
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText ageEditText = findViewById(R.id.ageEditText);
        Button submitButton = findViewById(R.id.submitButton);

        // Click-Listener für den Button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                String age = ageEditText.getText().toString().trim();

                // Eingabeprüfung
                if (name.isEmpty() || age.isEmpty()) {
                    // Toast-Meldung, wenn Felder leer sind
                    Toast.makeText(MainActivity.this, "Bitte alle Felder ausfüllen", Toast.LENGTH_SHORT).show();
                } else {
                    // Hier Daten an eine andere Activity übergeben
                    Intent intent = new Intent(MainActivity.this, AnzeigeActivity.class);
                    intent.putExtra("benutzerName", name);
                    intent.putExtra("benutzerAlter", age);
                    startActivity(intent);
                }
            }
        });
    }
}
