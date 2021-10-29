package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout rootLayout;
    Button btnShowSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.rootLayout);
        btnShowSnackBar = findViewById(R.id.btnShowSnackBar);

        btnShowSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(rootLayout, "IT Wala",
                        Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Clicked.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.setActionTextColor(getResources().getColor(R.color.white));
                snackbar.setTextColor(getResources().getColor(R.color.white));
                snackbar.setBackgroundTint(getResources().getColor(R.color.purple_500));
                snackbar.setAnchorView(btnShowSnackBar);
                snackbar.show();
            }
        });
    }
}