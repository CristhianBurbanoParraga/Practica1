package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.lblSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtSaludo.setText("Una Persona ha ingresado \n Los siguientes datos: \n Nombre: " +
                bundle.getString("NOMBRE") + "\n Género: " +
                bundle.getString("GENERO") + "\n Fecha de nacimiento: " +
                bundle.getString("FECHANACIMIENTO") + "\n Teléfono: " +
                bundle.getString("TELEFONO"));

    }
}