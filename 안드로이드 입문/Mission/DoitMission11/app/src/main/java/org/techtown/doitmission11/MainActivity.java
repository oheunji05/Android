package org.techtown.doitmission11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                Intent intent = new Intent(getApplicationContext(),MyService.class);
                intent.putExtra("text",text);
                startService(intent);
            }
        });

        Intent saveIntent = getIntent();
        onNewIntent(saveIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        textView = findViewById(R.id.textView);

        String text = intent.getStringExtra("text");

        textView.setText(text);


    }
}