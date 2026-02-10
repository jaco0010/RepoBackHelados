package com.jaco.heladeria.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Producto {
@Id
    private int id;
    private String sabor;
    private double precio;
    private String tamaño;
    private String presentancion;
    private int stock;

    public Producto(int id, String sabor, double precio, String tamaño, String presentancion, int stock) {
        this.id = id;
        this.sabor = sabor;
        this.precio = precio;
        this.tamaño = tamaño;
        this.presentancion = presentancion;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPresentancion() {
        return presentancion;
    }

    public void setPresentancion(String presentancion) {
        this.presentancion = presentancion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
