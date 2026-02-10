package com.jaco.heladeria.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.jaco.heladeria.Modelos.Producto;
import com.jaco.heladeria.interfaces.IProductoRepositorio;


@Service
public class ServicioProducto {
    private final IProductoRepositorio repositorio;

    public ServicioProducto(IProductoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

  
    public List<Producto> findAll() {
        return repositorio.findAll();
    }

    
    public Producto save(Producto producto) {
        return repositorio.save(producto);
    }
}

