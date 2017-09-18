package com.example.miell_000.listview.models;

/**
 * Created by miell_000 on 06/09/2017.
 */


public class Mensaje {
    private String remitente;
    private String email;
    private String asunto;
    private String color;
    private String contenido;


    public Mensaje( String  remitente, String email, String asunto, String color, String contenido){
        this.remitente = remitente;
        this.email = email;
        this.asunto = asunto;
        this.color = color;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getEmail() {
        return email;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getColor() {
        return color;
    }

    public String getContenido() {
        return contenido;
    }
}
