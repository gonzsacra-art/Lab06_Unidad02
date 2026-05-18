package com.empresa.vehiculos.model;
public class Medico {

    private String nombre;
    private String direccion;
    private String telefono;
    private String edad;
    private String especialidad;
    private String salario;
    private String nivel;

    public Medico(String nombre, String direccion, String telefono,
                  String edad, String especialidad,
                  String salario, String nivel) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.especialidad = especialidad;
        this.salario = salario;
        this.nivel = nivel;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public String getSalario() {
        return salario;
    }

    public String getNivel() {
        return nivel;
    }
}