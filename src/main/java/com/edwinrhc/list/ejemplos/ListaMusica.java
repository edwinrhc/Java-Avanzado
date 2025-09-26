package com.edwinrhc.list.ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaMusica {

    public static void main(String[] args) {

        PlayListArrayList();
        System.out.println("========================================");
        PlayListLinkedList();
    }

    // Usando ArrayList
    static void PlayListArrayList(){
        ArrayList<String> playList = new ArrayList<>();

        // Agregamos canciones
        playList.add("Canción A");
        playList.add("Canción B");
        playList.add("Canción C");
        playList.add("Canción D");
        playList.add("Canción E");

        //Insertar la inicio ( Es costoso: mueve todos los elementos)
        playList.add(0, "Intro");
        System.out.println("Todas las canciones: " +playList);

        // Eliminar en medio (Costoso: reacomoda índices)
        String eliminada =  playList.remove(2);
        System.out.println("Canción eliminada: " + eliminada);

        // Acceder rápido por índice (ventaja de ArrayList)
        System.out.println("Canción en posición 1: " + playList.get(1));

        System.out.println("Playlist final con ArrayList: " + playList);


    }

    static void PlayListLinkedList(){

        LinkedList<String> playList = new LinkedList<>();
        playList.add("Canción A");
        playList.add("Canción B");
        playList.add("Canción C");
        playList.add("Canción D");
        playList.add("Canción E");
        playList.add("Canción F");

        // Insertamos al inicio (muy eficiente: solo cambia referencia)
        playList.addFirst("Intro");

        // Eliminar en medio (más eficiente que ArrayList)
        playList.remove(2);

        // Acceder por índice (desventaja: lento, recorre nodos)
        System.out.println("Canción en posición 1: " + playList.get(1));

        System.out.println("Playlist final con LinkedList: " + playList);


    }
}
