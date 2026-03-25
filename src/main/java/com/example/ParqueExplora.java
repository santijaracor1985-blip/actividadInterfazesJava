package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("8:30 AM - 5:00 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Documento original";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Interactuando con experimentos");
    }
}