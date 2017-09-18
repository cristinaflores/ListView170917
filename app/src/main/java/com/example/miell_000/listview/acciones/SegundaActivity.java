package com.example.miell_000.listview.acciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.miell_000.listview.R;
import com.example.miell_000.listview.models.Mensaje;

import java.sql.CallableStatement;

public class SegundaActivity extends AppCompatActivity {
    TextView txtIcono;
    TextView textSecondRemitente;
    TextView textSecondEmail;
    TextView textSecondAsunto;
    TextView textSecondContenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_deatelle);

        Bundle extras = getIntent().getExtras();


        txtIcono = (TextView) findViewById(R.id.txtIcono);
        textSecondRemitente = (TextView) findViewById(R.id.textSecondRemitente);
        textSecondEmail = (TextView) findViewById(R.id.textSecondEmail);
        textSecondAsunto = (TextView) findViewById(R.id.textSecondAsunto);
        textSecondContenido = (TextView) findViewById(R.id.textSecondContenido);

        txtIcono.setText(extras.getString("KEY_ASUNTO"));
        textSecondRemitente.setText(extras.getString("KEY_REMITENTE"));
        textSecondEmail.setText(extras.getString("KEY_EMAIL"));
        textSecondAsunto.setText(extras.getString("KEY_ASUNTO"));
        textSecondContenido.setText(extras.getString("KEY_CONTENIDO"));

    }
}
