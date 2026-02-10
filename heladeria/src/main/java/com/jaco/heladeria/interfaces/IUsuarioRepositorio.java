package com.jaco.heladeria.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jaco.heladeria.Modelos.Usuario;


public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
