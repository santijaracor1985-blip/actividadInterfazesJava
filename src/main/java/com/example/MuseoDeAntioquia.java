package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("10:00 AM - 5:30 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Boleta pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Observando obras de arte");
    }
}