package com.umg.curso.ejercicio3busquedalistaordenada;

import java.util.Scanner;
import java.util.Arrays;

import static com.umg.curso.ejercicio3busquedalistaordenada.BusquedaBinaria.busquedaBinaria;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamanio de la lista: ");
        int tamano = scanner.nextInt();


        int[] lista = new int[tamano];
        System.out.println("Ingrese los elementos de la lista (ordenados de menor a mayor):");
        for (int i = 0; i < tamano; i++) {
            lista[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el numero a buscar: ");
        int objetivo = scanner.nextInt();


        int resultado = busquedaBinaria(lista, objetivo);

        System.out.println("Lista: " + Arrays.toString(lista) + " Buscar: " + objetivo + " Output: " + resultado);

        scanner.close();
    }
}