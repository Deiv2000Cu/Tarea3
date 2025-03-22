package com.umg.curso.ejercicio1_colas;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionTurnos gestion = new GestionTurnos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Agregar turno");
            System.out.println("2. Atender turno");
            System.out.println("3. Mostrar turnos en espera");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestion.agregarTurno();
                    break;
                case 2:
                    gestion.atenderTurno();
                    break;
                case 3:
                    gestion.mostrarTurnosEnEspera();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Esta opcion no existe.");

            }
        }
    }
}