package com.example.demo.Clase_12Mar025;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    @Query("SELECT count(*) FROM Usuario as p WHERE p.nombreUsuario=:nombreUsuario AND p.password=:password")
    Integer findByNombreUsuarioAndPassword(
            @Param("nombreUsuario") String nombreUsuario,
            @Param("password") String password);

    @Query("SELECT p from Usuario as p WHERE p.nombreUsuario=:nombreUsuario AND p.password=:password")
    Usuario findByNombreAndPassword(
            @Param("nombreUsuario") String nombreUsuario,
            @Param("password") String password);
}
