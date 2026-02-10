package com.jaco.heladeria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.jaco.heladeria.Modelos.Producto;

import com.jaco.heladeria.Service.ServicioProducto;


@Controller
public class ProductoController {
@Autowired
    ServicioProducto servicioProducto;

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return ResponseEntity.ok(servicioProducto.findAll());
    }

    @PostMapping
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto) {
        Producto respuesta = this.servicioProducto.save(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }
}
