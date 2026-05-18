package com.empresa.vehiculos.model;

import com.empresa.vehiculos.model.Empleado;

public class Enfermera {

    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;
    private String salario;
    private String categoria;

    public Enfermera(String nombre, String direccion,
                     String telefono, String edad,
                     String salario, String categoria) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEdad() {
        return edad;
    }

    public String getSalario() {
        return salario;
    }

    public String getCategoria() {
        return categoria;
    }
}