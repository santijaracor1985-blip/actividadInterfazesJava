package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public String getNombre() {
        return "Parque Explora";
    }

    @Override
    public String getHorario() {
        return "8:30 AM - 5:00 PM";
    }

    @Override
    public String getRequisito() {
        return "Documento original";
    }

    @Override
    public String getActividad() {
        return "Interactuando con experimentos";
    }
}