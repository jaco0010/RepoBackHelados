package com.jaco.heladeria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jaco.heladeria.Modelos.Administrador;
import com.jaco.heladeria.Service.ServicioAdministrador;

@RestController
@RequestMapping("/api/v1/usuario")
public class AdministradorController {

public class UsuarioController {

    @Autowired
    private ServicioAdministrador servicioAdministrador;

    @GetMapping
    public ResponseEntity<List<Administrador>> listar() {
        return ResponseEntity.ok(servicioAdministrador.findAll());
    }

    @PostMapping
    public ResponseEntity<Administrador> guardar(@RequestBody Administrador admin) {
        Administrador respuesta = this.servicioAdministrador.save(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }
}

}
