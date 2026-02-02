package com.jaco.heladeria.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helados")
public class HeladoController {
    private final HeladoService heladoService;

    public HeladoController(HeladoController heladoController){this.heladoService = heladoService;}
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Helado helado){
        try {
            Helado saved = heladoService.createHelado(helado);
            return new ResponseEntity<>(saved, HttpStatus.CREATED);
        } catch (IllegalArgumentException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
