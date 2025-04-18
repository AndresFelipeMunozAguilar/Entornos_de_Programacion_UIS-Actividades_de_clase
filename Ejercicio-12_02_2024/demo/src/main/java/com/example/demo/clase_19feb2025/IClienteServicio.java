package com.example.demo.clase_19feb2025;

import java.util.List;

/*
 * Cree una clase de ClienteServicio para codificar la lógica del negocio y
 * actúa como una capa intermedia entre el repositorio y la clase de
 * controlador.
 * Se utiliza la anotación @Transactional anotar métodos se ejecutan en
 * transacciones.
 * Ahora creamos la clase basada en la interface creada con anticipación
 */
public interface IClienteServicio {

    public List<Cliente> getClientes();

    public Cliente getCliente(Integer id);

    public Cliente grabarCliente(Cliente cliente);

    public void deleteCliente(Integer id);

}
