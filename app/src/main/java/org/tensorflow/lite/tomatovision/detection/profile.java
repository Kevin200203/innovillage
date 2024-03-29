package org.tensorflow.lite.tomatovision.detection;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.Utama:
                    // Pindah ke aktivitas profil
                    startActivity(new Intent(this, home.class));
                    return true;
                case R.id.Deteksi:
                    // Pindah ke aktivitas scan
                    startActivity(new Intent(this, DetectorActivity.class));
                    return true;
                case R.id.solusi:
                    // Pindah ke aktivitas solusi
                    startActivity(new Intent(this, profile.class));
                    return true;
                // Tambahkan case lain sesuai dengan kebutuhan Anda
                default:
                    return false;
            }
        });
    }
}