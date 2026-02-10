package com.jaco.heladeria.Service;

import org.springframework.stereotype.Service;
import com.jaco.heladeria.Modelos.Usuario;
import com.jaco.heladeria.interfaces.IUsuarioRepositorio;
import java.util.List;

@Service
public class ServicioUsuario {

    private final IUsuarioRepositorio repositorio;

    public ServicioUsuario(IUsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario> findAll() {
        return repositorio.findAll();
    }

    
    public Usuario save(Usuario producto) {
        return repositorio.save(producto);
    }
}

