package com.umg.curso.ejercicio3busquedalistaordenada;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] lista, int objetivo) {
        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (lista[medio] == objetivo) {
                return medio;
            }

            if (lista[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        //se encontro objeto
        return 1;
    }
}
