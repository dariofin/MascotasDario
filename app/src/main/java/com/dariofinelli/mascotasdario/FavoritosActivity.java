package com.dariofinelli.mascotasdario;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoritosActivity extends AppCompatActivity {

    private List<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.fabfotos).setVisibility(View.INVISIBLE);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.pet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        inicializarListaMascotas();
        RecyclerView rvMascotas = findViewById(R.id.rvMascotas);
        rvMascotas.setAdapter(new MascotasAdapter(mascotas));

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }
    public void inicializarListaMascotas(){
        mascotas =new ArrayList<Mascota>();
        mascotas.add(new Mascota("Simba", R.drawable.lion,14));
        mascotas.add(new Mascota("Lobito", R.drawable.fox,8));
        mascotas.add(new Mascota("Bangee", R.drawable.monkey,6));
        mascotas.add(new Mascota("Matute",R.drawable.cat,2));
        mascotas.add(new Mascota("Spaniel",R.drawable.cocker_spaniel,4));




    }
}
