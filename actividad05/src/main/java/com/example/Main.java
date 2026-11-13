package com.example;

public class Main {
    public static void main(String[] args) {
        Persona[] miembros = {
            new Estudiante("108272443", "Carlos", "Mejia", 18, "EST-2026", 4.7),

            new Profesor("172817932", "Ana", "Gomez", 42, "Ingeneria de software", 35),

            new Administrativo("18278367", "Luis", "Gonzales", 29, "Recursos humanos", 3)
        };

        for (Persona p: miembros){
            System.out.println(p.toString());
            System.out.println("Beneficio anual calculado "+ p.calcularBeneficioAnual());
        }
    }
}