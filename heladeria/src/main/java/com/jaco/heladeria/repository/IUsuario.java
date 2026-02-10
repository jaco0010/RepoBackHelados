package com.jaco.heladeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaco.heladeria.Modelos.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{

}
