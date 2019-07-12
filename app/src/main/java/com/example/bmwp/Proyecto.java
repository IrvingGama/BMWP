package com.example.bmwp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.PublicKey;

public class Proyecto extends AppCompatActivity {

    private Spinner proyectos;
    String[] listproyec = {"Seleccione un proyecto","Michoacan","Oaxaca","Queretaro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto);

        proyectos = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> adaptadorproy= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listproyec);
        proyectos.setAdapter(adaptadorproy );

        proyectos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast s1 = Toast.makeText(getApplicationContext(),"Proyecto Seleccionado " +  listproyec[i],Toast.LENGTH_LONG);
                        s1.show();
                        break;
                    case 2:
                        Toast s2 = Toast.makeText(getApplicationContext(),"Proyecto Seleccionado " + listproyec[i],Toast.LENGTH_LONG);
                        s2.show();
                        break;
                    case 3:
                        Toast s3 = Toast.makeText(getApplicationContext(),"Proyecto Seleccionado " + listproyec[i],Toast.LENGTH_LONG);
                        s3.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });


    }

    public void Colab(View view){
        Intent go_Cola = new Intent(this,Monitoreo.class);
        startActivity(go_Cola);
    }

}
