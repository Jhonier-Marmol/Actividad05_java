package com.example;

public class Profesor extends Persona {
    private String areaEspecialedad;
    private double horasSemanales; 

    public Profesor(String documento, String nombres, String apellidos, int edad, String areaEspecialedad, double horasSemanales){
        super(documento, nombres, apellidos, edad);
        this.areaEspecialedad = areaEspecialedad;
        this.horasSemanales = horasSemanales;
    }

    @Override 
    public double calcularBeneficioAnual(){
        return super.calcularBeneficioAnual() + (this.horasSemanales * 5000.0);
    }

    @Override 
    public String toString(){
        return super.toString()+", Especialidad: " + areaEspecialedad + ", Horas semanales: " + horasSemanales;
    }
}
