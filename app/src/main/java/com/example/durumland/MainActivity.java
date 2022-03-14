package com.example.durumland;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private TextView handytext;
    ImageButton shareme;

    AlertDialog dialog;
    MaterialAlertDialogBuilder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareme = (ImageButton) findViewById(R.id.sharebtn);
        handytext = findViewById(R.id.handytxt);

        LinearLayout phone = findViewById(R.id.handy);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Telefonat();
            }
        });
        CardView speise = findViewById(R.id.CardSpeiseKarte);
        speise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpeiseKarte.class));
                Toast.makeText(MainActivity.this, "deine Bestellung",Toast.LENGTH_LONG).show();
            }
        });
    }
    private void Telefonat() {
        String nummer = handytext.getText().toString().trim();
        String dial = "tel: " + nummer;

        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        }else {
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL){
            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Telefonat();
            }
    }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(MainActivity.this, "Wollen Sie uns echt schon verlassen?", Toast.LENGTH_SHORT).show();
    }
}