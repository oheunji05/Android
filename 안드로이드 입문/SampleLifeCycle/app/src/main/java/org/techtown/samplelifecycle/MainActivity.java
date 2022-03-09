package org.techtown.samplelifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        println("onCreate 호출됨");
    }

    @Override
    protected void onStart() {
        super.onStart();

        println("onStart 호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();

        println("onStop 호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        println("onDestroy 호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();

        println("onPause 호출됨");
        saveState();
    }

    @Override
    protected void onResume() {
        super.onResume();

        println("onResume 호출됨");
        restoreState();
    }

    public void println(String data){
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG).show();
        Log.d("Main",data);
    }

    protected void restoreState() {
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if ((pref != null) && (pref.contains("name"))) {
            String name = pref.getString("name","");
            nameInput.setText(name);
        }
    }

    protected void saveState(){
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name",nameInput.getText().toString());
        editor.commit();
    }

    protected void clearState() {
        SharedPreferences pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.commit();
    }

}