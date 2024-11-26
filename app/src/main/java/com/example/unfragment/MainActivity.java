package com.example.unfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loadFragmentButton = findViewById(R.id.loadFragmentButton);

        // Load dynamic fragment on button click
        loadFragmentButton.setOnClickListener(view -> loadFragment(new DynamicFragment()));
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.drawable.bounce, android.R.anim.fade_out)
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}
