package com.jaco.heladeria.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.jaco.heladeria.Modelos.Administrador;
import com.jaco.heladeria.interfaces.IAdministradorRepositorio;


@Service
public class ServicioAdministrador {


    private final IAdministradorRepositorio repositorio;

    public ServicioAdministrador(IAdministradorRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    
    public List<Administrador> findAll() {
        return repositorio.findAll();
    }

    
    public Administrador save(Administrador user) {
        return repositorio.save(user);
    }
}

