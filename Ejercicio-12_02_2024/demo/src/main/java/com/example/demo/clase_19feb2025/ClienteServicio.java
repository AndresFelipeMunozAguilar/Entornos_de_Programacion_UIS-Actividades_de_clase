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
    public List<ModeloCliente> getClientes() {
        return clientRepo.findAll();
    }
    
    @Override
    public ModeloCliente getCliente(Integer id) {
        return clientRepo.findById(id).orElse(null);
    }

    @
}
