package com.example.durumland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.jar.Attributes;

public class Kasse extends AppCompatActivity {

    TextView bestellung, userdaten, bemerkung ,gesamt, bemerkungtit;
    String kebab1, kebab2, kebab3, kebab4, kebab5, kebab6, kebab7, pide1, pide2, pide3, pide4, extras1, extras2, extras3, extras4, extras5, getrank1, getrank2, getrank3, getrank4, getrank5;
    float Kebab1, Kebab2, Kebab3, Kebab4, Kebab5, Kebab6, Kebab7, Pide1, Pide2, Pide3, Pide4, Extras1, Extras2, Extras3, Extras4, Extras5, Getrank1, Getrank2, Getrank3, Getrank4, Getrank5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kasse);

        bemerkungtit = findViewById(R.id.titel_bemerkung);
        bemerkung = findViewById(R.id.add_bemerkung);
        gesamt = findViewById(R.id.gesamtsumme);
        bestellung = findViewById(R.id.add_bestellung);
        userdaten = findViewById(R.id.add_userdaten);

        Bundle daten = getIntent().getExtras();
        //User-Daten
        String name = daten.getString("Name: ");
        String handynr = daten.getString("Handynr.: ");
        String strasse = daten.getString("Straße: ");
        String stadt = daten.getString("Stadt: ");
        String vermerk = daten.getString("Vermerk: ");

        //User
        String usr = "Name: " + name + ",\n" + "Handynr.: " + handynr + ",\n" + "Straße: " + strasse + ",\n" + "Plz, Stadt: " + stadt;
        userdaten.setText(usr);

        //Bemerkung
        if (vermerk.length() < 1){
            bemerkung.setVisibility(View.INVISIBLE);
            bemerkungtit.setVisibility(View.INVISIBLE);
        }else {
            bemerkung.append(vermerk);
        }


        String K1 = daten.getString("k1");
        int k1 = Integer.parseInt(K1);
        String K2 = daten.getString("k2");
        int k2 = Integer.parseInt(K2);
        String K3 = daten.getString("k3");
        int k3 = Integer.parseInt(K3);
        String K4 = daten.getString("k4");
        int k4 = Integer.parseInt(K4);
        String K5 = daten.getString("k5");
        int k5 = Integer.parseInt(K5);
        String K6 = daten.getString("k6");
        int k6 = Integer.parseInt(K6);
        String K7 = daten.getString("k7");
        int k7 = Integer.parseInt(K7);

        String P1 = daten.getString("p1");
        int p1 = Integer.parseInt(P1);
        String P2 = daten.getString("p2");
        int p2 = Integer.parseInt(P2);
        String P3 = daten.getString("p3");
        int p3 = Integer.parseInt(P3);
        String P4 = daten.getString("p4");
        int p4 = Integer.parseInt(P4);

        String E1 = daten.getString("e1");
        int e1 = Integer.parseInt(E1);
        String E2 = daten.getString("e2");
        int e2 = Integer.parseInt(E2);
        String E3 = daten.getString("e3");
        int e3 = Integer.parseInt(E3);
        String E4 = daten.getString("e4");
        int e4 = Integer.parseInt(E4);
        String E5 = daten.getString("e5");
        int e5 = Integer.parseInt(E5);

        String G1 = daten.getString("g1");
        int g1 = Integer.parseInt(G1);
        String G2 = daten.getString("g2");
        int g2 = Integer.parseInt(G2);
        String G3 = daten.getString("g3");
        int g3 = Integer.parseInt(G3);
        String G4 = daten.getString("g4");
        int g4 = Integer.parseInt(G4);
        String G5 = daten.getString("g5");
        int g5 = Integer.parseInt(G5);


        System.out.println("Der Wert von k1 im Kassenbereich ist: " + k1);

        if (k1 == 0){
            bestellung.append("");
        }else if (k1 > 0){
            String kebab1bez = daten.getString("kebab1bez");
            String kebab1preis = daten.getString("kebab1preis");
            String kebab1anzahl = daten.getString("kebab1anzahl");

            int Kebab1Anzahl = Integer.parseInt(kebab1anzahl);
            float Kebab1Preis = Float.parseFloat(kebab1preis);
            Kebab1 = (float)(Kebab1Preis*Kebab1Anzahl);
            kebab1 = String.format("%.2f", Kebab1);
            String bestell1 = "Bestellung: " + kebab1bez + "  x" + kebab1anzahl + ",\n" + "Preis: " + kebab1 + "€" + "\n";
            bestellung.append(bestell1);
            }

        if (k2 == 0){
            bestellung.append("");
        }else if (k2 > 0){
            String kebab2bez = daten.getString("kebab2bez");
            String kebab2anzahl = daten.getString("kebab2anzahl");
            String kebab2preis = daten.getString("kebab2preis");

            int Kebab2Anzahl = Integer.parseInt(kebab2anzahl);
            float Kebab2Preis = Float.parseFloat(kebab2preis);
            Kebab2 = (float)(Kebab2Preis*Kebab2Anzahl);
            kebab2 = String.format("%.2f", Kebab2);
            String bestell2 = "Bestellung: " + kebab2bez + "  x" + kebab2anzahl + ",\n" + "Preis: " + kebab2 + "€" + "\n";
            bestellung.append(bestell2);
        }

        if (k3 == 0){
            bestellung.append("");
        }else if (k3 > 0){
            String kebab3bez = daten.getString("kebab3bez");
            String kebab3anzahl = daten.getString("kebab3anzahl");
            String kebab3preis = daten.getString("kebab3preis");
            int Kebab3Anzahl = Integer.parseInt(kebab3anzahl);
            float Kebab3Preis = Float.parseFloat(kebab3preis);
            Kebab3 = (float)(Kebab3Preis*Kebab3Anzahl);
            kebab3 = String.format("%.2f", Kebab3);
            String bestell3 = "Bestellung: " + kebab3bez + "  x" + kebab3anzahl + ",\n" + "Preis: " + kebab3 + "€" + "\n";
            bestellung.append(bestell3);
        }

        if (k4 == 0){
            bestellung.append("");
        }else if (k4 > 0){
            String kebab4bez = daten.getString("kebab4bez");
            String kebab4anzahl = daten.getString("kebab4anzahl");
            String kebab4preis = daten.getString("kebab4preis");
            int Kebab4Anzahl = Integer.parseInt(kebab4anzahl);
            float Kebab4Preis = Float.parseFloat(kebab4preis);
            Kebab4 = (float)(Kebab4Preis*Kebab4Anzahl);
            kebab4 = String.format("%.2f", Kebab4);
            String bestell4 = "Bestellung: " + kebab4bez + "  x" + kebab4anzahl + ",\n" + "Preis: " + kebab4 + "€" + "\n";
            bestellung.append(bestell4);
        }

        if (k5 == 0){
            bestellung.append("");
        }else if (k5 > 0){
            String kebab5bez = daten.getString("kebab5bez");
            String kebab5anzahl = daten.getString("kebab5anzahl");
            String kebab5preis = daten.getString("kebab5preis");
            int Kebab5Anzahl = Integer.parseInt(kebab5anzahl);
            float Kebab5Preis = Float.parseFloat(kebab5preis);
            Kebab5 = (float)(Kebab5Preis*Kebab5Anzahl);
            kebab5 = String.format("%.2f", Kebab5);
            String bestell5 = "Bestellung: " + kebab5bez + "  x" + kebab5anzahl + ",\n" + "Preis: " + kebab5 + "€" + "\n";
            bestellung.append(bestell5);
        }

        if (k6 == 0){
            bestellung.append("");
        }else if (k6 > 0){
            String kebab6bez = daten.getString("kebab6bez");
            String kebab6anzahl = daten.getString("kebab6anzahl");
            String kebab6preis = daten.getString("kebab6preis");
            int Kebab6Anzahl = Integer.parseInt(kebab6anzahl);
            float Kebab6Preis = Float.parseFloat(kebab6preis);
            Kebab6 = (float)(Kebab6Preis*Kebab6Anzahl);
            kebab6 = String.format("%.2f", Kebab6);
            String bestell6 = "Bestellung: " + kebab6bez + "  x" + kebab6anzahl + ",\n" + "Preis: " + kebab6 + "€" + "\n";
            bestellung.append(bestell6);
        }

        if (k7 == 0){
            bestellung.append("");
        }else if (k7 > 0){
            String kebab7bez = daten.getString("kebab7bez");
            String kebab7anzahl = daten.getString("kebab7anzahl");
            String kebab7preis = daten.getString("kebab7preis");
            int Kebab7Anzahl = Integer.parseInt(kebab7anzahl);
            float Kebab7Preis = Float.parseFloat(kebab7preis);
            Kebab7 = (float)(Kebab7Preis*Kebab7Anzahl);
            kebab7 = String.format("%.2f", Kebab7);
            String bestell7 = "Bestellung: " + kebab7bez + "  x" + kebab7anzahl + ",\n" + "Preis: " + kebab7 + "€" + "\n";
            bestellung.append(bestell7);
        }

        if (p1 == 0){
            bestellung.append("");
        }else if (p1 > 0){
            String pide1bez = daten.getString("pide1bez");
            String pide1anzahl = daten.getString("pide1anzahl");
            String pide1preis = daten.getString("pide1preis");
            int Pide1Anzahl = Integer.parseInt(pide1anzahl);
            float Pide1Preis = Float.parseFloat(pide1preis);
            Pide1 = (float)(Pide1Preis*Pide1Anzahl);
            pide1 = String.format("%.2f", Pide1);
            String bestell8 = "Bestellung: " + pide1bez + "  x" + pide1anzahl + ",\n" + "Preis: " + pide1 + "€" + "\n";
            bestellung.append(bestell8);
        }

        if (p2 == 0){
            bestellung.append("");
        }else if (p2 > 0){
            String pide2bez = daten.getString("pide2bez");
            String pide2anzahl = daten.getString("pide2anzahl");
            String pide2preis = daten.getString("pide2preis");
            int Pide2Anzahl = Integer.parseInt(pide2anzahl);
            float Pide2Preis = Float.parseFloat(pide2preis);
            Pide2 = (float)(Pide2Preis*Pide2Anzahl);
            pide2 = String.format("%.2f", Pide2);
            String bestell9 = "Bestellung: " + pide2bez + "  x" + pide2anzahl + ",\n" + "Preis: " + pide2 + "€" + "\n";
            bestellung.append(bestell9);
        }

        if (p3 == 0){
            bestellung.append("");
        }else if (p3 > 0){
            String pide3bez = daten.getString("pide3bez");
            String pide3anzahl = daten.getString("pide3anzahl");
            String pide3preis = daten.getString("pide3preis");
            int Pide3Anzahl = Integer.parseInt(pide3anzahl);
            float Pide3Preis = Float.parseFloat(pide3preis);
            Pide3 = (float)(Pide3Preis*Pide3Anzahl);
            pide3 = String.format("%.2f", Pide3);
            String bestell10 = "Bestellung: " + pide3bez + "  x" + pide3anzahl + ",\n" + "Preis: " + pide3 + "€" + "\n";
            bestellung.append(bestell10);
        }

        if (p4 == 0){
            bestellung.append("");
        }else if (p4 > 0){
            String pide4bez = daten.getString("pide4bez");
            String pide4anzahl = daten.getString("pide4anzahl");
            String pide4preis = daten.getString("pide4preis");
            int Pide4Anzahl = Integer.parseInt(pide4anzahl);
            float Pide4Preis = Float.parseFloat(pide4preis);
            Pide4 = (float)(Pide4Preis*Pide4Anzahl);
            pide4 = String.format("%.2f", Pide4);
            String bestell11 = "Bestellung: " + pide4bez + "  x" + pide4anzahl + ",\n" + "Preis: " + pide4 + "€" + "\n";
            bestellung.append(bestell11);
        }

        if (e1 == 0){
            bestellung.append("");
        }else if (e1 > 0){
            String extras1bez = daten.getString("extras1bez");
            String extras1anzahl = daten.getString("extras1anzahl");
            String extras1preis = daten.getString("extras1preis");
            int Extras1Anzahl = Integer.parseInt(extras1anzahl);
            float Extras1Preis = Float.parseFloat(extras1preis);
            Extras1 = (float)(Extras1Preis*Extras1Anzahl);
            extras1 = String.format("%.2f", Extras1);
            String bestell12 = "Bestellung: " + extras1bez + "  x" + extras1anzahl + ",\n" + "Preis: " + extras1 + "€" + "\n";
            bestellung.append(bestell12);
        }

        if (e2 == 0){
            bestellung.append("");
        }else if (e2 > 0){
            String extras2bez = daten.getString("extras2bez");
            String extras2anzahl = daten.getString("extras2anzahl");
            String extras2preis = daten.getString("extras2preis");
            int Extras2Anzahl = Integer.parseInt(extras2anzahl);
            float Extras2Preis = Float.parseFloat(extras2preis);
            Extras2 = (float)(Extras2Preis*Extras2Anzahl);
            extras2 = String.format("%.2f", Extras2);
            String bestell13 = "Bestellung: " + extras2bez + "  x" + extras2anzahl + ",\n" + "Preis: " + extras2 + "€" + "\n";
            bestellung.append(bestell13);
        }

        if (e3 == 0){
            bestellung.append("");
        }else if (e3 > 0){
            String extras3bez = daten.getString("extras3bez");
            String extras3anzahl = daten.getString("extras3anzahl");
            String extras3preis = daten.getString("extras3preis");
            int Extras3Anzahl = Integer.parseInt(extras3anzahl);
            float Extras3Preis = Float.parseFloat(extras3preis);
            Extras3 = (float)(Extras3Preis*Extras3Anzahl);
            extras3 = String.format("%.2f", Extras3);
            String bestell14 = "Bestellung: " + extras3bez + "  x" + extras3anzahl + ",\n" + "Preis: " + extras3 + "€" + "\n";
            bestellung.append(bestell14);
        }

        if (e4 == 0){
            bestellung.append("");
        }else if (e4 > 0){
            String extras4bez = daten.getString("extras4bez");
            String extras4anzahl = daten.getString("extras4anzahl");
            String extras4preis = daten.getString("extras4preis");
            int Extras4Anzahl = Integer.parseInt(extras4anzahl);
            float Extras4Preis = Float.parseFloat(extras4preis);
            Extras4 = (float)(Extras4Preis*Extras4Anzahl);
            extras4 = String.format("%.2f", Extras4);
            String bestell15 = "Bestellung: " + extras4bez + "  x" + extras4anzahl + ",\n" + "Preis: " + extras4 + "€" + "\n";
            bestellung.append(bestell15);
        }

        if (e5 == 0){
            bestellung.append("");
        }else if (e5 > 0){
            String extras5bez = daten.getString("extras5bez");
            String extras5anzahl = daten.getString("extras5anzahl");
            String extras5preis = daten.getString("extras5preis");
            int Extras5Anzahl = Integer.parseInt(extras5anzahl);
            float Extras5Preis = Float.parseFloat(extras5preis);
            Extras5 = (float)(Extras5Preis*Extras5Anzahl);
            extras5 = String.format("%.2f", Extras1);
            String bestell16 = "Bestellung: " + extras5bez + "  x" + extras5anzahl + ",\n" + "Preis: " + extras5 + "€" + "\n";
            bestellung.append(bestell16);
        }

        if (g1 == 0){
            bestellung.append("");
        }else if (g1 > 0){
            String getrank1bez = daten.getString("getrank1bez");
            String getrank1anzahl = daten.getString("getrank1anzahl");
            String getrank1preis = daten.getString("getrank1preis");
            int Getrank1Anzahl = Integer.parseInt(getrank1anzahl);
            float Getrank1Preis = Float.parseFloat(getrank1preis);
            Getrank1 = (float)(Getrank1Preis*Getrank1Anzahl);
            getrank1 = String.format("%.2f", Getrank1);
            String bestell17 = "Bestellung: " + getrank1bez + "  x" + getrank1anzahl + ",\n" + "Preis: " + getrank1 + "€" + "\n";
            bestellung.append(bestell17);
        }

        if (g2 == 0){
            bestellung.append("");
        }else if (g2 > 0){
            String getrank2bez = daten.getString("getrank2bez");
            String getrank2anzahl = daten.getString("getrank2anzahl");
            String getrank2preis = daten.getString("getrank2preis");
            int Getrank2Anzahl = Integer.parseInt(getrank2anzahl);
            float Getrank2Preis = Float.parseFloat(getrank2preis);
            Getrank2 = (float)(Getrank2Preis*Getrank2Anzahl);
            getrank2 = String.format("%.2f", Getrank2);
            String bestell18 = "Bestellung: " + getrank2bez + "  x" + getrank2anzahl + ",\n" + "Preis: " + getrank2 + "€" + "\n";
            bestellung.append(bestell18);
        }

        if (g3 == 0){
            bestellung.append("");
        }else if (g3 > 0){
            String getrank3bez = daten.getString("getrank3bez");
            String getrank3anzahl = daten.getString("getrank3anzahl");
            String getrank3preis = daten.getString("getrank1preis");
            int Getrank3Anzahl = Integer.parseInt(getrank3anzahl);
            float Getrank3Preis = Float.parseFloat(getrank3preis);
            Getrank3 = (float)(Getrank3Preis*Getrank3Anzahl);
            getrank3 = String.format("%.2f", Getrank3);
            String bestell19 = "Bestellung: " + getrank3bez + "  x" + getrank3anzahl + ",\n" + "Preis: " + getrank3 + "€" + "\n";
            bestellung.append(bestell19);
        }

        if (g4 == 0){
            bestellung.append("");
        }else if (g4 > 0){
            String getrank4bez = daten.getString("getrank4bez");
            String getrank4anzahl = daten.getString("getrank4anzahl");
            String getrank4preis = daten.getString("getrank4preis");
            int Getrank4Anzahl = Integer.parseInt(getrank4anzahl);
            float Getrank4Preis = Float.parseFloat(getrank4preis);
            Getrank4 = (float)(Getrank4Preis*Getrank4Anzahl);
            getrank4 = String.format("%.2f", Getrank4);
            String bestell20 = "Bestellung: " + getrank4bez + "  x" + getrank4anzahl + ",\n" + "Preis: " + getrank4 + "€" + "\n";
            bestellung.append(bestell20);
        }

        if (g5 == 0){
            bestellung.append("");
        }else if (g5 > 0){
            String getrank5bez = daten.getString("getrank5bez");
            String getrank5anzahl = daten.getString("getrank5anzahl");
            String getrank5preis = daten.getString("getrank5preis");
            int Getrank5Anzahl = Integer.parseInt(getrank5anzahl);
            float Getrank5Preis = Float.parseFloat(getrank5preis);
            Getrank5 = (float)(Getrank5Preis*Getrank5Anzahl);
            getrank5 = String.format("%.2f", Getrank5);
            String bestell21 = "Bestellung: " + getrank5bez + "  x" + getrank5anzahl + ",\n" + "Preis: " + getrank5 + "€" + "\n";
            bestellung.append(bestell21);
        }

        float zsm = Kebab1 + Kebab2 + Kebab3 + Kebab4 + Kebab5 + Kebab6 + Pide1 + Pide2 + Pide3 + Pide4 + Extras1 + Extras2 + Extras3 + Extras4 + Extras5 + Getrank1 + Getrank2 + Getrank3 + Getrank4 + Getrank5;
        gesamt.setText(String.format("%.2f", zsm) + "€");
        float fehlt = (12 - zsm);

        Button abschicken = findViewById(R.id.bestellungabschicken);
        abschicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zsm <= 12){
                    Toast.makeText(Kasse.this, "Es fehlen noch " + String.format("%.2f", fehlt) + "€", Toast.LENGTH_SHORT).show();

                }else {
                    startActivity(new Intent(Kasse.this, MainActivity.class));
                    Toast.makeText(Kasse.this, "Vielen Danke für Ihre Bestellung", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}