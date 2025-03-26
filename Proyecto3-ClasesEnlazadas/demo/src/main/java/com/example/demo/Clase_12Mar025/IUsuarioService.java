package com.example.demo.Clase_12Mar025;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.Clase_26Mar2025.LoginDto;

public interface IUsuarioService {

    List<Usuario> getUsuarios();

    Usuario nuevoUsuario(Usuario usuario);

    Usuario buscarUsuario(Long id);

    int borrarUsuario(Long id);

    int login(LoginDto usuarioDto);

    ResponseEntity<?> ingresar(LoginDto usuarioDto);
}
