package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.contactos.adaptadores.ListaContactosAdapter;
import com.example.contactos.db.DbContactos;
import com.example.contactos.entidades.Contactos;

import java.util.ArrayList;
import java.util.ListIterator;

public class BuscarActivity extends AppCompatActivity {

    RecyclerView listacontactos;
    ArrayList<Contactos> listaArrayContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        listacontactos=findViewById(R.id.listaContactos);
        listacontactos.setLayoutManager(new LinearLayoutManager(this));

        DbContactos dbContactos= new DbContactos(BuscarActivity.this);
        listaArrayContactos = new ArrayList<>();

        ListaContactosAdapter adapter = new ListaContactosAdapter(dbContactos.mostrarContactos());
        listacontactos.setAdapter(adapter);



    }
}