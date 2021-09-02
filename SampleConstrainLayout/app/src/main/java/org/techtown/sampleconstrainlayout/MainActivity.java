package org.techtown.sampleconstrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickedButton1(View view){
        Toast.makeText(this,"button1이 눌러졌습니다",Toast.LENGTH_LONG).show();
    }
    public void onClickedButton2(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
        startActivity(intent);
    }
    public void onClickedButton3(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
        startActivity(intent);
    }

}