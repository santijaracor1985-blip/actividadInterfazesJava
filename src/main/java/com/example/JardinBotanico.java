package com.example;

public class JardinBotanico implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("9:00 AM - 4:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Entrada libre (algunos eventos requieren registro)";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Caminando por el Bosque Tropical...");
    }
}