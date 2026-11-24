package com.example.lifecyclecount;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int count = 5;
    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = findViewById(R.id.count_text);
        Button countButton = findViewById(R.id.count_button);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
        }
        countText.setText("Nestor's Count: " + count);

        countButton.setOnClickListener(v -> {
            count++;
            countText.setText("Nestor's Count: " + count);
        });
    }

    private static final String TAG = "Dabu";
    @Override protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
}