package com.ivi.petsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity2 extends AppCompatActivity {

    Button btn_masc;
    Button btn_map;
    Button btn_cierra;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btn_masc = findViewById(R.id.btn_mascota);
        btn_map = findViewById(R.id.btn_mapa);
        btn_cierra= findViewById(R.id.btn_cerrarSesion);

        btn_masc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity2.this, MascotaActivity.class);
                startActivity(intent);
            }
        });
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity2.this, MapaActivity.class);
                startActivity(intent);
            }
        });
        btn_cierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();

            }
        });

    }
}