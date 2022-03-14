package com.example.durumland;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.nio.charset.StandardCharsets;

public class SpeiseKarte extends AppCompatActivity {
    TextView kebab1bez, kebab1preis, kebab2preis, kebab2bez, kebab3preis, kebab3bez, kebab4preis, kebab4bez, kebab5preis, kebab5bez, kebab6bez, kebab6preis, kebab7bez, kebab7preis;
    TextView pide1bez, pide1preis, pide2bez, pide2preis, pide3bez, pide3preis, pide4bez, pide4preis;
    TextView extras1bez, extras1preis, extras2bez, extras2preis, extras3bez, extras3preis, extras4bez, extras4preis, extras5bez, extras5preis;
    TextView getrank1bez, getrank1preis, getrank2bez, getrank2preis, getrank3bez, getrank3preis, getrank4bez, getrank4preis, getrank5bez, getrank5preis;

    String kebab1anzahl, kebab2anzahl, kebab3anzahl, kebab4anzahl, kebab5anzahl, kebab6anzahl, kebab7anzahl;
    String pide1anzahl, pide2anzahl, pide3anzahl, pide4anzahl;
    String extras1anzahl, extras2anzahl, extras3anzahl, extras4anzahl, extras5anzahl;
    String getrank1anzahl, getrank2anzahl, getrank3anzahl, getrank4anzahl, getrank5anzahl;
    String K1, K2, K3, K4, K5, K6, K7, P1, P2, P3, P4, E1, E2, E3, E4, E5, G1, G2, G3, G4, G5;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speise_karte);

        // Ab hier Kebab-Gerichte
        ElegantNumberButton bestellung1 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_1);
        K1 = bestellung1.getNumber();
        bestellung1.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K1 = bestellung1.getNumber();
                kebab1anzahl = bestellung1.getNumber();
            }
        });

        ElegantNumberButton bestellung2 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_2);
        K2 = bestellung2.getNumber();
        bestellung2.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K2 = bestellung2.getNumber();
                kebab2anzahl = bestellung2.getNumber();
            }
        });

        ElegantNumberButton bestellung3 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_3);
        K3 = bestellung3.getNumber();
        bestellung3.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K3 = bestellung3.getNumber();
                kebab3anzahl = bestellung3.getNumber();
            }
        });

        ElegantNumberButton bestellung4 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_4);
        K4 = bestellung4.getNumber();
        bestellung4.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K4 = bestellung4.getNumber();
                kebab4anzahl = bestellung4.getNumber();
            }
        });

        ElegantNumberButton bestellung5 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_5);
        K5 = bestellung5.getNumber();
        bestellung5.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K5 = bestellung5.getNumber();
                kebab5anzahl = bestellung5.getNumber();
            }
        });

        ElegantNumberButton bestellung6 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_6);
        K6 = bestellung6.getNumber();
        bestellung6.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K6 = bestellung6.getNumber();
                kebab6anzahl = bestellung6.getNumber();
            }
        });

        ElegantNumberButton bestellung7 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_7);
        K7 = bestellung7.getNumber();
        bestellung7.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                K7 = bestellung7.getNumber();
                kebab7anzahl = bestellung7.getNumber();
            }
        });

        //Ab hier kommt Pide..
        ElegantNumberButton bestellung8 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_8);
        P1 = bestellung8.getNumber();
        bestellung8.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                P1 = bestellung8.getNumber();
                pide1anzahl = bestellung8.getNumber();
            }
        });

        ElegantNumberButton bestellung9 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_9);
        P2 = bestellung9.getNumber();
        bestellung9.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                P2 = bestellung9.getNumber();
                pide2anzahl = bestellung9.getNumber();
            }
        });

        ElegantNumberButton bestellung10 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_10);
        P3 = bestellung10.getNumber();
        bestellung10.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                P3 = bestellung10.getNumber();
                pide3anzahl = bestellung10.getNumber();
            }
        });

        ElegantNumberButton bestellung11 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_11);
        P4 = bestellung11.getNumber();
        bestellung11.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                P4 = bestellung11.getNumber();
                pide4anzahl = bestellung11.getNumber();
            }
        });

        // Ab hier kommen die Extras
        ElegantNumberButton bestellung12 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_12);
        E1 = bestellung12.getNumber();
        bestellung12.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                E1 = bestellung12.getNumber();
                extras1anzahl = bestellung12.getNumber();
            }
        });

        ElegantNumberButton bestellung13 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_13);
        E2 = bestellung13.getNumber();
        bestellung13.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                E2 = bestellung13.getNumber();
                extras2anzahl = bestellung13.getNumber();
            }
        });

        ElegantNumberButton bestellung14 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_14);
        E3 = bestellung14.getNumber();
        bestellung14.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                E3 = bestellung14.getNumber();
                extras3anzahl = bestellung14.getNumber();
            }
        });

        ElegantNumberButton bestellung15 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_15);
        E4 = bestellung15.getNumber();
        bestellung15.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                E4 = bestellung15.getNumber();
                extras4anzahl = bestellung15.getNumber();
            }
        });

        ElegantNumberButton bestellung16 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_16);
        E5 = bestellung16.getNumber();
        bestellung16.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                E5 = bestellung16.getNumber();
                extras5anzahl = bestellung16.getNumber();
            }
        });

        //Ab hier kommen die Getränke..
        ElegantNumberButton bestellung17 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_17);
        G1 = bestellung17.getNumber();
        bestellung17.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                G1 = bestellung17.getNumber();
                getrank1anzahl = bestellung17.getNumber();
            }
        });

        ElegantNumberButton bestellung18 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_18);
        G2 = bestellung18.getNumber();
        bestellung18.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                G2 = bestellung18.getNumber();
                getrank2anzahl = bestellung18.getNumber();
            }
        });

        ElegantNumberButton bestellung19 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_19);
        G3 = bestellung19.getNumber();
        bestellung19.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                G3 = bestellung19.getNumber();
                getrank3anzahl = bestellung19.getNumber();
            }
        });

        ElegantNumberButton bestellung20 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_20);
        G4 = bestellung20.getNumber();
        bestellung20.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                G4 = bestellung20.getNumber();
                getrank4anzahl = bestellung20.getNumber();
            }
        });

        ElegantNumberButton bestellung21 = (ElegantNumberButton) findViewById(R.id.btn_bestellung_21);
        G5 = bestellung21.getNumber();
        bestellung21.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                G5 = bestellung21.getNumber();
                getrank5anzahl = bestellung21.getNumber();
            }
        });

        //ID's Initialisierung
        kebab1bez = findViewById(R.id.kebab1_bez);
        kebab1preis = findViewById(R.id.kebab1_preis);
        kebab2bez = findViewById(R.id.kebab2_bez);
        kebab2preis = findViewById(R.id.kebab2_preis);
        kebab3bez = findViewById(R.id.kebab3_bez);
        kebab3preis = findViewById(R.id.kebab3_preis);
        kebab4bez = findViewById(R.id.kebab4_bez);
        kebab4preis = findViewById(R.id.kebab4_preis);
        kebab5bez = findViewById(R.id.kebab5_bez);
        kebab5preis = findViewById(R.id.kebab5_preis);
        kebab6bez = findViewById(R.id.kebab6_bez);
        kebab6preis = findViewById(R.id.kebab6_preis);
        kebab7bez = findViewById(R.id.kebab7_bez);
        kebab7preis = findViewById(R.id.kebab7_preis);
        //pide
        pide1bez = findViewById(R.id.pide1_bez);
        pide1preis = findViewById(R.id.pide1_preis);
        pide2bez = findViewById(R.id.pide2_bez);
        pide2preis = findViewById(R.id.pide2_preis);
        pide3bez = findViewById(R.id.pide3_bez);
        pide3preis = findViewById(R.id.pide3_preis);
        pide4bez = findViewById(R.id.pide4_bez);
        pide4preis = findViewById(R.id.pide4_preis);
        //extras
        extras1bez = findViewById(R.id.extras1_bez);
        extras1preis = findViewById(R.id.extras1_preis);
        extras2preis = findViewById(R.id.extras1_preis);
        extras2bez = findViewById(R.id.extras2_bez);
        extras2preis = findViewById(R.id.extras2_preis);
        extras3bez = findViewById(R.id.extras3_bez);
        extras3preis = findViewById(R.id.extras3_preis);
        extras4bez = findViewById(R.id.extras4_bez);
        extras4preis = findViewById(R.id.extras4_preis);
        extras5bez = findViewById(R.id.extras5_bez);
        extras5preis = findViewById(R.id.extras5_preis);
        //getränke
        getrank1bez = findViewById(R.id.drink1_bez);
        getrank1preis = findViewById(R.id.drink1_preis);
        getrank2bez = findViewById(R.id.drink2_bez);
        getrank2preis = findViewById(R.id.drink2_preis);
        getrank3bez = findViewById(R.id.drink3_bez);
        getrank3preis = findViewById(R.id.drink3_preis);
        getrank4bez = findViewById(R.id.drink4_bez);
        getrank4preis = findViewById(R.id.drink4_preis);
        getrank5bez = findViewById(R.id.drink5_bez);
        getrank5preis = findViewById(R.id.drink5_preis);
        //Strings GetText..
        String Kebab1Bez = kebab1bez.getText().toString();
        String Kebab1Preis = kebab1preis.getText().toString();
        String Kebab2Bez = kebab2bez.getText().toString();
        String Kebab2Preis = kebab2preis.getText().toString();
        String Kebab3Bez = kebab3bez.getText().toString();
        String Kebab3Preis = kebab3preis.getText().toString();
        String Kebab4Bez = kebab4bez.getText().toString();
        String Kebab4Preis = kebab4preis.getText().toString();
        String Kebab5Bez = kebab5bez.getText().toString();
        String Kebab5Preis = kebab5preis.getText().toString();
        String Kebab6Bez = kebab6bez.getText().toString();
        String Kebab6Preis = kebab6preis.getText().toString();
        String Kebab7Bez = kebab7bez.getText().toString();
        String Kebab7Preis = kebab7preis.getText().toString();
        //pide
        String Pide1Bez = pide1bez.getText().toString();
        String Pide1Preis = pide1preis.getText().toString();
        String Pide2Bez = pide2bez.getText().toString();
        String Pide2Preis = pide2preis.getText().toString();
        String Pide3Bez = pide3bez.getText().toString();
        String Pide3Preis = pide3preis.getText().toString();
        String Pide4Bez = pide4bez.getText().toString();
        String Pide4Preis = pide4preis.getText().toString();
        //extras
        String Extras1Bez = extras1bez.getText().toString();
        String Extras1Preis = extras1preis.getText().toString();
        String Extras2Bez = extras2bez.getText().toString();
        String Extras2Preis = extras2preis.getText().toString();
        String Extras3Bez = extras3bez.getText().toString();
        String Extras3Preis = extras3preis.getText().toString();
        String Extras4Bez = extras4bez.getText().toString();
        String Extras4Preis = extras4preis.getText().toString();
        String Extras5Bez = extras5bez.getText().toString();
        String Extras5Preis = extras5preis.getText().toString();
        //getränke
        String Getrank1Bez = getrank1bez.getText().toString();
        String Getrank1Preis = getrank1preis.getText().toString();
        String Getrank2Bez = getrank2bez.getText().toString();
        String Getrank2Preis = getrank2preis.getText().toString();
        String Getrank3Bez = getrank3bez.getText().toString();
        String Getrank3Preis = getrank3preis.getText().toString();
        String Getrank4Bez = getrank4bez.getText().toString();
        String Getrank4Preis = getrank4preis.getText().toString();
        String Getrank5Bez = getrank5bez.getText().toString();
        String Getrank5Preis = getrank5preis.getText().toString();

        System.out.println("Die aktuelle Nummer ist: " + bestellung1.getNumber());


        //ButtonWeiter
        Button btnweiter = findViewById(R.id.btnweiter);
        //Datenübergabewerte
        btnweiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SpeiseKarte.this, KundenDaten.class);
                intent.putExtra("kebab1bez", Kebab1Bez);
                intent.putExtra("kebab1preis", Kebab1Preis);
                intent.putExtra("kebab1anzahl", kebab1anzahl);
                intent.putExtra("kebab2bez", Kebab2Bez);
                intent.putExtra("kebab2preis", Kebab2Preis);
                intent.putExtra("kebab2anzahl", kebab2anzahl);
                intent.putExtra("kebab3bez", Kebab3Bez);
                intent.putExtra("kebab3preis", Kebab3Preis);
                intent.putExtra("kebab3anzahl", kebab3anzahl);
                intent.putExtra("kebab4bez", Kebab4Bez);
                intent.putExtra("kebab4preis", Kebab4Preis);
                intent.putExtra("kebab4anzahl", kebab4anzahl);
                intent.putExtra("kebab5bez", Kebab5Bez);
                intent.putExtra("kebab5preis", Kebab5Preis);
                intent.putExtra("kebab5anzahl", kebab5anzahl);
                intent.putExtra("kebab6bez", Kebab6Bez);
                intent.putExtra("kebab6preis", Kebab6Preis);
                intent.putExtra("kebab6anzahl", kebab6anzahl);
                intent.putExtra("kebab7bez", Kebab7Bez);
                intent.putExtra("kebab7preis", Kebab7Preis);
                intent.putExtra("kebab7anzahl", kebab7anzahl);
                //pide
                intent.putExtra("pide1bez", Pide1Bez);
                intent.putExtra("pide1preis", Pide1Preis);
                intent.putExtra("pide1anzahl", pide1anzahl);
                intent.putExtra("pide2bez", Pide2Bez);
                intent.putExtra("pide2preis", Pide2Preis);
                intent.putExtra("pide2anzahl", pide2anzahl);
                intent.putExtra("pide3bez", Pide3Bez);
                intent.putExtra("pide3preis", Pide3Preis);
                intent.putExtra("pide3anzahl", pide3anzahl);
                intent.putExtra("pide4bez", Pide4Bez);
                intent.putExtra("pide4preis", Pide4Preis);
                intent.putExtra("pide4anzahl", pide4anzahl);
                //extras
                intent.putExtra("extras1bez", Extras1Bez);
                intent.putExtra("extras1preis", Extras1Preis);
                intent.putExtra("extras1anzahl", extras1anzahl);
                intent.putExtra("extras2bez", Extras2Bez);
                intent.putExtra("extras2preis", Extras2Preis);
                intent.putExtra("extras2anzahl", extras2anzahl);
                intent.putExtra("extras3bez", Extras3Bez);
                intent.putExtra("extras3preis", Extras3Preis);
                intent.putExtra("extras3anzahl", extras3anzahl);
                intent.putExtra("extras4bez", Extras4Bez);
                intent.putExtra("extras4preis", Extras4Preis);
                intent.putExtra("extras4anzahl", extras4anzahl);
                intent.putExtra("extras5bez", Extras5Bez);
                intent.putExtra("extras5preis", Extras5Preis);
                intent.putExtra("extras5anzahl", extras5anzahl);
                //getränke
                intent.putExtra("getrank1bez", Getrank1Bez);
                intent.putExtra("getrank1preis", Getrank1Preis);
                intent.putExtra("getrank1anzahl", getrank1anzahl);
                intent.putExtra("getrank2bez", Getrank2Bez);
                intent.putExtra("getrank2preis", Getrank2Preis);
                intent.putExtra("getrank2anzahl", getrank2anzahl);
                intent.putExtra("getrank3bez", Getrank3Bez);
                intent.putExtra("getrank3preis", Getrank3Preis);
                intent.putExtra("getrank3anzahl", getrank3anzahl);
                intent.putExtra("getrank4bez", Getrank4Bez);
                intent.putExtra("getrank4preis", Getrank4Preis);
                intent.putExtra("getrank4anzahl", getrank4anzahl);
                intent.putExtra("getrank5bez", Getrank5Bez);
                intent.putExtra("getrank5preis", Getrank5Preis);
                intent.putExtra("getrank5anzahl", getrank5anzahl);

                intent.putExtra("k1", K1);
                intent.putExtra("k2", K2);
                intent.putExtra("k3", K3);
                intent.putExtra("k4", K4);
                intent.putExtra("k5", K5);
                intent.putExtra("k6", K6);
                intent.putExtra("k7", K7);

                intent.putExtra("p1", P1);
                intent.putExtra("p2", P2);
                intent.putExtra("p3", P3);
                intent.putExtra("p4", P4);

                intent.putExtra("e1", E1);
                intent.putExtra("e2", E2);
                intent.putExtra("e3", E3);
                intent.putExtra("e4", E4);
                intent.putExtra("e5", E5);

                intent.putExtra("g1", G1);
                intent.putExtra("g2", G2);
                intent.putExtra("g3", G3);
                intent.putExtra("g4", G4);
                intent.putExtra("g5", G5);

                startActivity(intent);
            }
        });
    }
}