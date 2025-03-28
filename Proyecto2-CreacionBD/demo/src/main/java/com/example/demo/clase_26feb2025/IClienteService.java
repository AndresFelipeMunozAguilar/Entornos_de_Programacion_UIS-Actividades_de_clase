package com.example.demo.clase_26feb2025;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    List<Cliente> findAll();

    Optional<Cliente> findById(Integer id);

    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    void delete(Integer id);

}
