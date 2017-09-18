package com.example.miell_000.listview.acciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.miell_000.listview.R;
import com.example.miell_000.listview.adapters.MensajeAdapter;
import com.example.miell_000.listview.models.Mensaje;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Mensaje> mensanjes = new ArrayList<>();

        //cargo los mensajescon este metodo
        this.cargarLista(mensanjes);

        ListView listaMensaje = (ListView) findViewById(R.id.listaCorreos);

        //asigna adaptador al listview
        listaMensaje.setAdapter(new MensajeAdapter(mensanjes));

        //implemento listener del evento clic del listview
        listaMensaje.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Mensaje mensajeSeleccionado = mensanjes.get(position);
                abrirMensaje(mensajeSeleccionado);
            }
        });
    }
    private void abrirMensaje(Mensaje mensajeSeleccionado){
        Intent intent = new Intent(MainActivity.this,SegundaActivity.class);

        //paso parametros en intent
        intent.putExtra("KEY_REMITENTE",mensajeSeleccionado.getRemitente());
        intent.putExtra("KEY_EMAIL", mensajeSeleccionado.getEmail());
        intent.putExtra("KEY_ASUNTO",mensajeSeleccionado.getAsunto());
        intent.putExtra("KEY_CONTENIDO",mensajeSeleccionado.getContenido());

        //llamado a activity
        startActivity(intent);
    }
    private void cargarLista(ArrayList<Mensaje> mensajes){



        //primer mensaje
        mensajes.add(new Mensaje(
                "Cristina Flores",
                "cflores@gmail.com",
                "Pedido de ayuda",
                "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño\n",
                "#d500f9"
        ));

        //segundo mensaje
        mensajes.add(new Mensaje(
                "Cristina Flores",
                "cflores@gmail.com",
                "Pedido de ayuda",
                "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño\n",
                "#d500f9"
        ));

        //tercer mensaje
        mensajes.add(new Mensaje(
                "Cristina Flores",
                "cflores@gmail.com",
                "Pedido de ayuda",
                "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño\n",
                "#d500f9"
        ));

    }

}
