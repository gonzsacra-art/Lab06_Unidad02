package com.empresa.vehiculos.model;

import com.empresa.vehiculos.model.Persona;

public class Paciente {

    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;
    private String fechaIngreso;
    private String fechaAlta;
    private String motivo;
    private String medicamentos;

    public Paciente(String nombre, String direccion,
                    String telefono, String edad,
                    String fechaIngreso, String fechaAlta,
                    String motivo, String medicamentos) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = fechaAlta;
        this.motivo = motivo;
        this.medicamentos = medicamentos;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getMedicamentos() {
        return medicamentos;
    }
}