package com.jaco.heladeria.interfaces;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jaco.heladeria.Modelos.Administrador;


@Repository
public interface IAdministradorRepositorio extends JpaRepository<Administrador, Integer> {
}
