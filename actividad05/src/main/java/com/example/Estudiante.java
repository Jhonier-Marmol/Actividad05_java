package com.example;

public class Estudiante extends Persona {
    private String codigoEstudiantil;
    private double promedioAcumulado;

    public Estudiante(String documento, String nombres, String apellidos, int edad, String codigoEstudiantil, double promedioAcumulado){
        super(documento, nombres, apellidos, edad);
        this.codigoEstudiantil = codigoEstudiantil;
        this.promedioAcumulado = promedioAcumulado;
    }

    @Override 
    public double calcularBeneficioAnual(){
        return super.calcularBeneficioAnual() * (promedioAcumulado/3.0);
    }

    @Override 
    public String toString(){
        return super.toString() + ", Codigo: " + codigoEstudiantil + ", Promedio: " + promedioAcumulado;
    }
}
