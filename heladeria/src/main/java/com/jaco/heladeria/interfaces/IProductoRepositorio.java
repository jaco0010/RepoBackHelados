package com.jaco.heladeria.interfaces;
import com.jaco.heladeria.Modelos.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {

}
