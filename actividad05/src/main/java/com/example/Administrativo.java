package com.example;

public class Administrativo extends Persona {
    private String dependencia;
    private int nivelCargo;

    public Administrativo(String documento, String nombres, String apellidos, int edad, String dependecia, int nivelCargo){
        super(documento, nombres, apellidos, edad);
        this.dependencia = dependecia;
        this.nivelCargo = nivelCargo;
    }

    @Override 
    public double calcularBeneficioAnual(){
        return super.calcularBeneficioAnual()+ (this.nivelCargo * 120000.0);
    }

    @Override 
    public String toString(){
        return super.toString()+", Dependencia: " + dependencia + ", Nivel de cargo: " + nivelCargo;
    }
}
