package androidinternship;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Button by ID
        Button button = findViewById(R.id.button);

        // Set up a click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a simple Toast message
                Toast.makeText(MainActivity.this, "Hello from Android!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}