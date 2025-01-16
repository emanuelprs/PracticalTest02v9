package ro.pub.cs.systems.eim.practicaltest02v9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PracticalTest02MainActivityv9 extends AppCompatActivity {
    Button button;
    EditText cuvant;
    EditText lungime;
    TextView rezultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_practical_tst02v9_main);

        cuvant = findViewById(R.id.word);
        button = findViewById(R.id.button);
        lungime = findViewById(R.id.length);
        rezultat = findViewById(R.id.result);

        Button buttonOpenMap = findViewById(R.id.open_map);
        buttonOpenMap.setOnClickListener(v -> {
            Intent intent = new Intent(PracticalTest02MainActivityv9.this, MapsActivity.class);
            intent.putExtra("latitude", 44.573);
            intent.putExtra("longitude", 23.726);
            startActivity(intent);
        });
    }
}