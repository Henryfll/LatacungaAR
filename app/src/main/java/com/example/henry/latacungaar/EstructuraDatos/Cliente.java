package com.example.henry.latacungaar.EstructuraDatos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cliente {

    public String fecha_Afiliacion;
    public String nombre;
    public String email;
    public String idcliente;

    public Cliente() {
    }

    public Cliente(String nombre, String email, String idcliente) {

        Calendar fecha = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha_Afiliacion = formato.format(fecha.getTime());
        this.nombre = nombre;
        this.email=email;
        this.idcliente=idcliente;
    }


    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getFecha_Afiliacion() {
        return fecha_Afiliacion;
    }

    public void setFecha_Afiliacion(String fecha_Afiliacion) {
        this.fecha_Afiliacion = fecha_Afiliacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
