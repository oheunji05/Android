package org.techtown.doitmission_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, MyService.class);
                intent.putExtra("text",text);
                startService(intent);
            }
        });

        Intent receivedIntent = getIntent();
        onNewIntent(receivedIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {

        String text = intent.getStringExtra("text");

        textView.setText(text);

        super.onNewIntent(intent);
    }
}