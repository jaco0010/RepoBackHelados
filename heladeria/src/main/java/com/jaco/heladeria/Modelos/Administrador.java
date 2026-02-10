package com.jaco.heladeria.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Administrador
{
    @Id
    private int id;
    private String nombre;
    private String email;
    private String contraseña;
    private String telefono;
    private  String rol;


    public Administrador() {
    }

    public Administrador(String nombre, String email, String contraseña, String telefono, int id, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.id = id;
        this.rol = rol;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}



