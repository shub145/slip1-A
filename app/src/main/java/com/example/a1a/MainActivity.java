package com.example.a1a;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Yogi","onCreate() method called");
    }
    protected void onStart() {
        super.onStart();
        Log.d("Yogi","onStart() method called");
    }
    protected void onResume() {
        super.onResume();
        Log.d("Yogi","onResume() method called");
    }
    protected void onPause() {
        super.onPause();
        Log.d("Yogi","onPause() method called");
    }
    protected void onStop() {
        super.onStop();
        Log.d("Yogi","onStop() method called");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d("Yogi","onRestart() method called");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Yogi","onDestroy() method called");
    }
}