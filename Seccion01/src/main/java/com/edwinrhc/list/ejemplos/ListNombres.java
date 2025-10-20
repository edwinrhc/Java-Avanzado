package com.edwinrhc.list.ejemplos;

import java.util.LinkedList;

public class ListNombres {

    public static void main(String[] args) {
        LinkedList<String> nombres = new LinkedList<>();

        // Agregar elementos
        nombres.add("Edwin");
        nombres.add("Ana");
        nombres.add("Ricardo");
        nombres.add("Dayiro");
        nombres.add("Yassiel");

        // Agregar al inicio y al final
        nombres.addFirst("Primero");
        nombres.addLast("Ultimo");

        // Recorrer la lista
        for(String nombre: nombres){
            System.out.println(nombre);
        }

        // Eliminar
        nombres.remove("Ana");
        nombres.removeFirst();
        nombres.removeLast();

        System.out.println("Lista final: "+ nombres);

    }

}
