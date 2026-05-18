package com.empresa.vehiculos.model;

public class Empleado extends Persona {

    protected String fechaIngreso;
    protected String fechaFinContrato;
    protected String horaEntrada;
    protected String horaSalida;
    protected double salario;

    public Empleado(String nombre, String direccion, String telefono, int edad,
                    String fechaIngreso, String fechaFinContrato,
                    String horaEntrada, String horaSalida, double salario) {

        super(nombre, direccion, telefono, edad);

        this.fechaIngreso = fechaIngreso;
        this.fechaFinContrato = fechaFinContrato;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.salario = salario;
    }
}