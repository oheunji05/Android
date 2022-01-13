package org.techtown.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test);

        btn_move = findViewById(R.id.btn_move);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString(); //String형태가 아니라서 toString을 써서 String형태로 바꿈
                Intent intent = new Intent(MainActivity.this, SubActivity.class); // 현재 액티비티.this, 이동하고 싶은 액티비티.class
                intent.putExtra("str", str);
                startActivity(intent); // 액티비티 이동
            }
        });
    }
}