package com.example.demo.clase_19feb2025;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = ModeloCliente.TABLE_NAME)

/*
 * Esta es una clase de entidad JPA simple con el nombre de la clase y los
 * nombres de los campos son idénticos a los nombres de las columnas del
 * producto de la tabla en la base de datos, para minimizar las anotaciones
 * utilizadas.
 */
public class ModeloCliente {

    // Atributos
    public static final String TABLE_NAME = "cliente";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;
    private String documento;
    private String tipdoc;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String email;

    public ModeloCliente(int idcliente, String documento, String tipdoc, String nombres, String apellidos,
            String direccion, String email) {

        this.idcliente = idcliente;
        this.documento = documento;
        this.tipdoc = tipdoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;

    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "ModeloCliente{" +
                "idcliente=" + idcliente +
                ", documento='" + documento + '\'' +
                ", tipdoc='" + tipdoc + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
