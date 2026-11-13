package com.example;

public class Persona {
    protected String documento;
    protected String nombres;
    protected String apellidos;
    protected int edad;

    public Persona(String documento, String nombres, String apellidos, int edad){
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        setEdad(edad);
    }

    public double calcularBeneficioAnual(){
        return 150000.0;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override 
    public String toString(){
        return "Documento: " + documento + ", Nombre: " + nombres + ", Apellido: " + apellidos + ", Edad: " + edad;
    }
}
