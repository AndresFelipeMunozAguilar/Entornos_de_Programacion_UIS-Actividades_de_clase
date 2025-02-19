package com.example.demo.clase_19feb2025;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

/*
 * A continuación, cree la clase ClienteController que actúa como un
 * controlador Spring MVC para manejar las solicitudes de los clientes,
 * además contiene todos los puntos finales(endpoint) de la API REST para
 * las operaciones CRUD con el código inicial de la siguiente manera:
 * Como se puede ver, inyectamos una instancia de la clase ClienteServicio
 * a este controlador: Spring creará una automáticamente en tiempo de
 * ejecución. Escribiremos código para los métodos del controlador al
 * implementar cada operación CRUD, el único que implementamos por
 * ahora es el de listar.
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/api/clientes")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteService;

    @GetMapping("/list")
    public List<ModeloCliente> consultarTodo() {
        return (clienteService.getClientes());
    }

    @GetMapping("/list/(id)")
    public ModeloCliente buscarPorId(@PathVariable Integer id) {
        return clienteService.getCliente(id);
    }

    @PostMapping("/")
    public ResponseEntity<ModeloCliente> agregar(@RequestBody ModeloCliente cliente) {
        ModeloCliente obj = clienteService.grabarCliente(cliente);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<ModeloCliente> editar(@RequestBody ModeloCliente cliente) {
        ModeloCliente obj = clienteService.getCliente(cliente.getIdcliente());
        if (obj != null) {

            obj.setDireccion(cliente.getDireccion());
            obj.setApellidos(cliente.getApellidos());
            obj.setDocumento(cliente.getDocumento());
            obj.setEmail(cliente.getEmail());
            obj.setNombres(cliente.getNombres());
            obj.setTipdoc(cliente.getTipdoc());
            clienteService.grabarCliente(obj);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ModeloCliente> eliminar(@PathVariable Integer id) {
        ModeloCliente obj = clienteService.getCliente(id);

        if (obj != null) {
            clienteService.deleteCliente(id);
        } else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
