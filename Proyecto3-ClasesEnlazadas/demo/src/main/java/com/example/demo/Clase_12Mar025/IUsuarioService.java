package com.example.demo.Clase_12Mar025;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> getUsuarios();

    Usuario nuevoUsuario(Usuario usuario);

    Usuario buscarUsuario(Long id);

    int borrarUsuario(Long id);
}
