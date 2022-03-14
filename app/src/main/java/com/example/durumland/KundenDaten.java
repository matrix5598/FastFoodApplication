package com.example.durumland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KundenDaten extends AppCompatActivity {

    EditText name, handy, strasse, stadt, vermerk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunden_daten);

        name = findViewById(R.id.edit_name);
        handy = findViewById(R.id.edit_nummer);
        strasse = findViewById(R.id.edit_strasse);
        stadt = findViewById(R.id.edit_stadt_plz);
        vermerk = findViewById(R.id.edit_vermerk);

        Bundle gerichte = getIntent().getExtras();

        String kebab1bez = gerichte.getString("kebab1bez");
        String kebab1preis = gerichte.getString("kebab1preis");
        String kebab1anzahl = gerichte.getString("kebab1anzahl");
        String kebab2bez = gerichte.getString("kebab2bez");
        String kebab2preis = gerichte.getString("kebab2preis");
        String kebab2anzahl = gerichte.getString("kebab2anzahl");
        String kebab3bez = gerichte.getString("kebab3bez");
        String kebab3preis = gerichte.getString("kebab3preis");
        String kebab3anzahl = gerichte.getString("kebab3anzahl");
        String kebab4bez = gerichte.getString("kebab4bez");
        String kebab4preis = gerichte.getString("kebab4preis");
        String kebab4anzahl = gerichte.getString("kebab4anzahl");
        String kebab5bez = gerichte.getString("kebab5bez");
        String kebab5preis = gerichte.getString("kebab5preis");
        String kebab5anzahl = gerichte.getString("kebab5anzahl");
        String kebab6bez = gerichte.getString("kebab6bez");
        String kebab6preis = gerichte.getString("kebab6preis");
        String kebab6anzahl = gerichte.getString("kebab6anzahl");
        String kebab7bez = gerichte.getString("kebab7bez");
        String kebab7preis = gerichte.getString("kebab7preis");
        String kebab7anzahl = gerichte.getString("kebab7anzahl");
        //pide
        String pide1bez = gerichte.getString("pide1bez");
        String pide1preis = gerichte.getString("pide1preis");
        String pide1anzahl = gerichte.getString("pide1anzahl");
        String pide2bez = gerichte.getString("pide2bez");
        String pide2preis = gerichte.getString("pide2preis");
        String pide2anzahl = gerichte.getString("pide2anzahl");
        String pide3bez = gerichte.getString("pide3bez");
        String pide3preis = gerichte.getString("pide3preis");
        String pide3anzahl = gerichte.getString("pide3anzahl");
        String pide4bez = gerichte.getString("pide4bez");
        String pide4preis = gerichte.getString("pide4preis");
        String pide4anzahl = gerichte.getString("pide4anzahl");
        //extras
        String extras1bez = gerichte.getString("extras1bez");
        String extras1preis = gerichte.getString("extras1preis");
        String extras1anzahl = gerichte.getString("extras1anzahl");
        String extras2bez = gerichte.getString("extras2bez");
        String extras2preis = gerichte.getString("extras2preis");
        String extras2anzahl = gerichte.getString("extras2anzahl");
        String extras3bez = gerichte.getString("extras3bez");
        String extras3preis = gerichte.getString("extras3preis");
        String extras3anzahl = gerichte.getString("extras3anzahl");
        String extras4bez = gerichte.getString("extras4bez");
        String extras4preis = gerichte.getString("extras4preis");
        String extras4anzahl = gerichte.getString("extras4anzahl");
        String extras5bez = gerichte.getString("extras5bez");
        String extras5preis = gerichte.getString("extras5preis");
        String extras5anzahl = gerichte.getString("extras5anzahl");
        //getränke
        String getrank1bez = gerichte.getString("getrank1bez");
        String getrank1preis = gerichte.getString("getrank1preis");
        String getrank1anzahl = gerichte.getString("getrank1anzahl");
        String getrank2bez = gerichte.getString("getrank2bez");
        String getrank2preis = gerichte.getString("getrank2preis");
        String getrank2anzahl = gerichte.getString("getrank2anzahl");
        String getrank3bez = gerichte.getString("getrank3bez");
        String getrank3preis = gerichte.getString("getrank3preis");
        String getrank3anzahl = gerichte.getString("getrank3anzahl");
        String getrank4bez = gerichte.getString("getrank4bez");
        String getrank4preis = gerichte.getString("getrank4preis");
        String getrank4anzahl = gerichte.getString("getrank4anzahl");
        String getrank5bez = gerichte.getString("getrank5bez");
        String getrank5preis = gerichte.getString("getrank5preis");
        String getrank5anzahl = gerichte.getString("getrank5anzahl");

        String K1 = gerichte.getString("k1");
        String K2 = gerichte.getString("k2");
        String K3 = gerichte.getString("k3");
        String K4 = gerichte.getString("k4");
        String K5 = gerichte.getString("k5");
        String K6 = gerichte.getString("k6");
        String K7 = gerichte.getString("k7");

        int k1 = Integer.parseInt(K1);
        System.out.println("Der Wert von KundenDaten ist:" + k1);


        String P1 = gerichte.getString("p1");
        String P2 = gerichte.getString("p2");
        String P3 = gerichte.getString("p3");
        String P4 = gerichte.getString("p4");

        String E1 = gerichte.getString("e1");
        String E2 = gerichte.getString("e2");
        String E3 = gerichte.getString("e3");
        String E4 = gerichte.getString("e4");
        String E5 = gerichte.getString("e5");

        String G1 = gerichte.getString("g1");
        String G2 = gerichte.getString("g2");
        String G3 = gerichte.getString("g3");
        String G4 = gerichte.getString("g4");
        String G5 = gerichte.getString("g5");

        Button weiterkasse = findViewById(R.id.btn_weiterkasse);
        weiterkasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = name.getText().toString().trim();
                String Handy = handy.getText().toString().trim();
                String Strasse = strasse.getText().toString().trim();
                String Stadt = stadt.getText().toString().trim();
                String Vermerk = vermerk.getText().toString().trim();

                if (Name.length() <= 5 && Handy.length() <= 5 && Strasse.length() <= 5 && Stadt.length() <= 5){
                    Toast.makeText(KundenDaten.this, "Bitte alle Felder ausfüllen", Toast.LENGTH_SHORT).show();;
                }else if(Name.length() < 5){
                    name.setError("Bitte dieses Feld ausfüllen");
                }else if(Handy.length() < 5){
                    handy.setError("Bitte dieses Feld ausfüllen");
                }else if (strasse.length() < 5){
                    strasse.setError("Bitte dieses Feld ausfüllen");
                }else if (stadt.length() < 5){
                    stadt.setError("Bitte dieses Feld ausfüllen");
                }
                else {
                    Intent intent = new Intent(KundenDaten.this, Kasse.class);
                    //User-Daten
                    intent.putExtra("Name: ", Name);
                    intent.putExtra("Handynr.: ", Handy);
                    intent.putExtra("Straße: ", Strasse);
                    intent.putExtra("Stadt: ", Stadt);
                    intent.putExtra("Vermerk: ", Vermerk);
                    //Kebab-Gerichte
                    intent.putExtra("kebab1bez", kebab1bez);
                    intent.putExtra("kebab1preis", kebab1preis);
                    intent.putExtra("kebab1anzahl", kebab1anzahl);
                    intent.putExtra("kebab2bez", kebab2bez);
                    intent.putExtra("kebab2preis", kebab2preis);
                    intent.putExtra("kebab2anzahl", kebab2anzahl);
                    intent.putExtra("kebab3bez", kebab3bez);
                    intent.putExtra("kebab3preis", kebab3preis);
                    intent.putExtra("kebab3anzahl", kebab3anzahl);
                    intent.putExtra("kebab4bez", kebab4bez);
                    intent.putExtra("kebab4preis", kebab4preis);
                    intent.putExtra("kebab4anzahl", kebab4anzahl);
                    intent.putExtra("kebab5bez", kebab5bez);
                    intent.putExtra("kebab5preis", kebab5preis);
                    intent.putExtra("kebab5anzahl", kebab5anzahl);
                    intent.putExtra("kebab6bez", kebab6bez);
                    intent.putExtra("kebab6preis", kebab6preis);
                    intent.putExtra("kebab6anzahl", kebab6anzahl);
                    intent.putExtra("kebab7bez", kebab7bez);
                    intent.putExtra("kebab7preis", kebab7preis);
                    intent.putExtra("kebab7anzahl", kebab7anzahl);
                    //Pide-Gerichte
                    intent.putExtra("pide1bez", pide1bez);
                    intent.putExtra("pide1preis", pide1preis);
                    intent.putExtra("pide1anzahl", pide1anzahl);
                    intent.putExtra("pide2bez", pide2bez);
                    intent.putExtra("pide2preis", pide2preis);
                    intent.putExtra("pide2anzahl", pide2anzahl);
                    intent.putExtra("pide3bez", pide3bez);
                    intent.putExtra("pide3preis", pide3preis);
                    intent.putExtra("pide3anzahl", pide3anzahl);
                    intent.putExtra("pide4bez", pide4bez);
                    intent.putExtra("pide4preis", pide4preis);
                    intent.putExtra("pide4anzahl", pide4anzahl);
                    //Extras
                    intent.putExtra("extras1bez", extras1bez);
                    intent.putExtra("extras1preis", extras1preis);
                    intent.putExtra("extras1anzahl", extras1anzahl);
                    intent.putExtra("extras2bez", extras2bez);
                    intent.putExtra("extras2preis", extras2preis);
                    intent.putExtra("extras2anzahl", extras2anzahl);
                    intent.putExtra("extras3bez", extras3bez);
                    intent.putExtra("extras3preis", extras3preis);
                    intent.putExtra("extras3anzahl", extras3anzahl);
                    intent.putExtra("extras4bez", extras4bez);
                    intent.putExtra("extras4preis", extras4preis);
                    intent.putExtra("extras4anzahl", extras4anzahl);
                    intent.putExtra("extras5bez", extras5bez);
                    intent.putExtra("extras5preis", extras5preis);
                    intent.putExtra("extras5anzahl", extras5anzahl);
                    //Getränke
                    intent.putExtra("getrank1bez", getrank1bez);
                    intent.putExtra("getrank1preis", getrank1preis);
                    intent.putExtra("getrank1anzahl", getrank1anzahl);
                    intent.putExtra("getrank2bez", getrank2bez);
                    intent.putExtra("getrank2preis", getrank2preis);
                    intent.putExtra("getrank2anzahl", getrank2anzahl);
                    intent.putExtra("getrank3bez", getrank3bez);
                    intent.putExtra("getrank3preis", getrank3preis);
                    intent.putExtra("getrank3anzahl", getrank3anzahl);
                    intent.putExtra("getrank4bez", getrank4bez);
                    intent.putExtra("getrank4preis", getrank4preis);
                    intent.putExtra("getrank4anzahl", getrank4anzahl);
                    intent.putExtra("getrank5bez", getrank5bez);
                    intent.putExtra("getrank5preis", getrank5preis);
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
            }
        });
    }
}