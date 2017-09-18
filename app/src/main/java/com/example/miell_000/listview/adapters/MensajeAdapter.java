package com.example.miell_000.listview.adapters;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.miell_000.listview.R;
import com.example.miell_000.listview.models.Mensaje;

import java.util.ArrayList;

/**
 * Created by miell_000 on 06/09/2017.
 */

public class MensajeAdapter extends BaseAdapter {

    private ArrayList<Mensaje> mensajes;

    private final int MAX_LARGO_MENSAJE=40;

    public MensajeAdapter(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    //retorna cantidad de mensajes de la lista
    @Override
    public int getCount() {
        return mensajes.size();
    }
    //devolvemos el objeto segun la posicion
    @Override
    public Object getItem(int position) {
        return mensajes.get(position);
    }

    //devolvemos el id asociada a la posicion
    @Override
    public long getItemId(int position) {
        return 0;
    }

    //retorna la vista armada
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View convertView;

        //optimizacion de la lista recibida
        if (view == null){
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mensaje,viewGroup);
        }else{
            convertView = view;
        }

        Mensaje mensaje = (Mensaje) getItem(position);

        TextView txtIcono = (TextView) viewGroup.findViewById(R.id.txtIcono);
        TextView txtRemitente = (TextView) viewGroup.findViewById(R.id.txtRemitente);
        TextView txtEmail = (TextView) viewGroup.findViewById(R.id.txtEmail);
        TextView txtAsunto = (TextView) viewGroup.findViewById(R.id.txtAsunto);


        txtIcono.setText(mensaje.getRemitente().substring(0,1));
        txtIcono.getBackground().setColorFilter(Color.parseColor(mensaje.getColor()), PorterDuff.Mode.SRC);
        txtRemitente.setText(mensaje.getRemitente());
        txtEmail.setText(mensaje.getEmail());
        txtAsunto.setText(mensaje.getAsunto());


        //acoto las lineas del mensaje
       if (mensaje.getAsunto().length()>MAX_LARGO_MENSAJE){
            txtAsunto.setText(mensaje.getAsunto().substring(0,MAX_LARGO_MENSAJE));
        }else{
           txtAsunto.setText(mensaje.getAsunto());
       }


        return convertView;
    }
}
