package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<EspacioCultural> lugares = new ArrayList<>();

        lugares.add(new JardinBotanico());
        lugares.add(new MuseoDeAntioquia());
        lugares.add(new ParqueExplora());

        for (EspacioCultural lugar : lugares) {
            System.out.println("Lugar: " + lugar.getNombre());
            System.out.println("Horario: " + lugar.getHorario());
            System.out.println("Requisito: " + lugar.getRequisito());
            System.out.println("Actividad: " + lugar.getActividad());
            System.out.println("----------------------------");
        }
    }
}