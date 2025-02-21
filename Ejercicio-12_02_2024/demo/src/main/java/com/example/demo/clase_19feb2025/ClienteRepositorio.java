package com.example.demo.clase_19feb2025;

import org.springframework.data.jpa.repository.JpaRepository;

/* Cree la interface del repositorio de usuarios ampliando el repositorio
 * JPA. Hay métodos integrados para operaciones CRUD en JpaRepository, no
 * es necesario escribir casi ninguna consulta SQL. 
*/
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
