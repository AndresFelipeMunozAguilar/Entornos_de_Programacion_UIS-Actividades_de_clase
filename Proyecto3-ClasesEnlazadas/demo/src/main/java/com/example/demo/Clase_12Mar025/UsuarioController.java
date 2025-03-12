package com.example.demo.Clase_12Mar025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/list")
    public List<Usuario> cargarUsuarios() {
        return usuarioService.getUsuarios();
    }

    @GetMapping("/list/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarUsuario(id);
    }

    @PostMapping("/")
    public ResponseEntity<Usuario> agregar (@RequestBody Usuario usuario) {
        Usuario obj = usuarioService.nuevoUsuario(usuario);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }


    @PutMapping("/")
    public ResponseEntity<Usuario> editar(@RequestBody Usuario usuario) {
        Usuario obj = usuarioService.buscarUsuario(usuario.getId());
        if (obj != null) {
            obj.setEmail(usuario.getEmail());
            obj.setIdTipoDocumento(usuario.getIdTipoDocumento());
            obj.setNombre(usuario.getNombre());
            obj.setNombreUsuario(usuario.getNombreUsuario());
            obj.setNumeroDocumento(usuario.getNumeroDocumento());
            obj.setPassword(usuario.getPassword());
            usuarioService.nuevoUsuario(obj);
            return new ResponseEntity<>(obj, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> eliminar(@PathVariable Long id) {
        Usuario obj = usuarioService.buscarUsuario(id);
        if (obj != null) {
            usuarioService.borrarUsuario(id);
            return new ResponseEntity<>(obj, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
