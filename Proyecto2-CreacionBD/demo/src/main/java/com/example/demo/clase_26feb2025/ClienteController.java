package com.example.demo.clase_26feb2025;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") Integer idCliente) {
        return clienteService.findById(idCliente)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {

        return clienteService.findById(cliente.getIdCliente())
                .map(c -> ResponseEntity.ok(clienteService.update(cliente)))
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Cliente> delete(@PathVariable("id") Integer idCliente) {
        return clienteService.findById(idCliente)
                .map(c -> {
                    clienteService.delete(idCliente);
                    return ResponseEntity.ok(c);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
