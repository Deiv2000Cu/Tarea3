package com.umg.curso.ejercicio1_colas;


import java.util.LinkedList;
import java.util.Queue;


public class GestionTurnos {

    private Queue<Integer> colaTurnos;
    private int numeroTurnoActual;



    public GestionTurnos() {
        this.colaTurnos = new LinkedList<>();
        this.numeroTurnoActual = 1;
    }

    public void agregarTurno() {
        colaTurnos.add(numeroTurnoActual);
        System.out.println("Agregar turno " + numeroTurnoActual);
        numeroTurnoActual++;
    }

    public void atenderTurno() {
        if (!colaTurnos.isEmpty()) {
            int turnoAtendido = colaTurnos.poll();
            System.out.println("Atender turno -> Cliente con turno " + turnoAtendido + " atendido");
        } else {
            System.out.println("No hay turnos en espera.");
        }
    }

    public void mostrarTurnosEnEspera() {
        System.out.println("Mostrar turnos en espera -> " + colaTurnos);
    }


}