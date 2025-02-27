package com.example.demo.clase_19feb2025;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clientRepo;

    @Override
    public List<Cliente> getClientes() {
        return clientRepo.findAll();
    }

    @Override
    public Cliente getCliente(Integer id) {
        return clientRepo.findById(id).orElse(null);
    }

    @Override
    public Cliente grabarCliente(Cliente cliente) {
        return clientRepo.save(cliente);
    }

    @Override
    public void deleteCliente(Integer id) {
        clientRepo.deleteById(id);
    }
}
