package com.example.tugas_pertemuan08.ui.tukan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.tugas_pertemuan08.R;

public class TukanDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukan_detail);

        // Setting warna status bar dan navigation bar
        statusNavBar();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    // Setting warna status bar dan navigation bar
    private void statusNavBar() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        // Set the status bar color
        Window window = getWindow();
        int statusBarColor = ContextCompat.getColor(this, R.color.imperial_red);
        int navigatorBarColor = ContextCompat.getColor(this, R.color.white);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigatorBarColor);

        // warna action bar
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        int color = ContextCompat.getColor(this, R.color.imperial_red); // Replace "your_color" with the name of your color resource
        actionBar.setBackgroundDrawable(new ColorDrawable(color));
    }
}