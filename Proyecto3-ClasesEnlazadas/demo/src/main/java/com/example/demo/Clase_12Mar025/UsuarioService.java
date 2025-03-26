package com.example.demo.Clase_12Mar025;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.DemoApplication;
import com.example.demo.Clase_26Mar2025.LoginDto;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService implements IUsuarioService {

    private final DemoApplication demoApplication;

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    UsuarioService(DemoApplication demoApplication) {
        this.demoApplication = demoApplication;
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario nuevoUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        Usuario usuario = null;
        usuario = usuarioRepositorio.findById(id).orElse(null);

        if (usuario == null) {
            return null;
        }

        return usuario;
    }

    @Override
    public int borrarUsuario(Long id) {
        usuarioRepositorio.deleteById(id);
        return 1;
    }

    @Override
    public int login(LoginDto usuarioDto) {
        int u = usuarioRepositorio.findByNombreUsuarioAndPassword(
                usuarioDto.getNombreUsuario(),
                usuarioDto.getPassword());

        return u;
    }

    @Override
    public ResponseEntity<?> ingresar(LoginDto usuarioDto) {
        Map<String, Object> response = new HashMap<>();

        Usuario usuario = null;

        try {

            usuario = usuarioRepositorio.findByNombreAndPassword(
                    usuarioDto.getNombreUsuario(),
                    usuarioDto.getPassword());

            if (usuario == null) {

                response.put("Usuario", null);
                response.put("Mensaje", "Alerta: Usuario o password incorrectos");
                response.put("StatusCode", HttpStatus.NOT_FOUND.value());

                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

            } else {

                response.put("Usuario", null);
                response.put("Mensaje", "Datos correctos");
                response.put("StatusCode", HttpStatus.OK.value());

                return new ResponseEntity<>(response, HttpStatus.OK);
            }

        } catch (Exception e) {

            response.put("Usuario", null);
            response.put("Mensaje", "Ha ocurrido un error");
            response.put("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}
