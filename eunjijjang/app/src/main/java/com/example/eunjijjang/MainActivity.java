package com.example.eunjijjang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickButtonInstagram(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/o_eun_ji/"));
        startActivity(intent); //실행
    }

    public void clickButtonNaverBlog(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/eunjijjang05"));
        startActivity(intent); //실행
    }

    public void clickButtonGithub(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/oheunji05"));
        startActivity(intent); //실행
    }

    public void clickButtonFaceBook(View view){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100016034561924"));
        startActivity(intent); //실행
    }

}