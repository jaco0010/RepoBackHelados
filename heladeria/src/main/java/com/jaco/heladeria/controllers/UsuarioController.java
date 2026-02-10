package com.jaco.heladeria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaco.heladeria.Modelos.Usuario;
import com.jaco.heladeria.Service.ServicioUsuario;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    ServicioUsuario servicioUsuario;

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(servicioUsuario.findAll());
    }

    @PostMapping
    public ResponseEntity<Usuario> guardar(@RequestBody Usuario user) {
        Usuario respuesta = this.servicioUsuario.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }
}

