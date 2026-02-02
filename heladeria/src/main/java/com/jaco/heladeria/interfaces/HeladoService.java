package com.jaco.heladeria.interfaces;

public interface HeladoService {

    boolean agregarSabor(String nombre);

    boolean eliminarSabor(String nombre);

    String[] listarSabores();

    boolean buscarSabor(String nombre);
}



