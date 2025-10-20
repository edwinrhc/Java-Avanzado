package com.edwinrhc.list.ejercicio01;


import java.util.LinkedList;
import java.util.Scanner;

/**
 * Simular una playlist usando LinkedList<String> que permita:
 * Agregar canción al inicio (intro).
 * Agregar canción al final (última canción).
 * Eliminar una canción por nombre.
 * Mostrar la lista completa.
 * Salir.
 *
 */

public class ListaReproduccionMusica {

    private LinkedList<String> listaReproduccion = new LinkedList<>();

    public void agregarInicioMusica(String music){
        listaReproduccion.addFirst(music);
        System.out.println("Agregada al inicio: " + music);
    }

    public void agregarFinalMusica(String music){
        listaReproduccion.addLast(music);
        System.out.println("Agregada al final: " + music);
    }

    public void eliminarMusica(String music){
       if(listaReproduccion.remove(music)){
           System.out.println("Canción eliminada: " + music);
       }else{
           System.out.println("La canción no existe en l");
       }
    }

    public void mostrarLista(){
        if(listaReproduccion.isEmpty()){
            System.out.println("No hay canciones en la lista");
        }else{
            System.out.println("Lista de canciones: ");
            int i = 1;
            for(String music: listaReproduccion){
                System.out.println(i++ + ". " + music);
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaReproduccionMusica lista = new ListaReproduccionMusica();
        boolean activo = true;

        while(activo){
            System.out.println("\n--- Lista de Reproducción Musical ---");
            System.out.println("1. Agregar canción al inicio (intro)");
            System.out.println("2. Agregar canción al final (última canción)");
            System.out.println("3. Eliminar una canción por nombre");
            System.out.println("4. Mostrar la lista completa");
            System.out.println("5. Salir");
            System.out.print("Elige una opción:");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.print("Canción agregada al inicio: ");
                    String music = sc.nextLine();
                    lista.agregarInicioMusica(music);
                    break;
                case 2:
                    System.out.print("Canción agregada al final: ");
                    music = sc.nextLine();
                    lista.agregarFinalMusica(music);
                    break;
                case 3:
                    System.out.print("Ingrese nombre de la canción a eliminar: ");
                    music = sc.nextLine();
                    lista.eliminarMusica(music);
                    break;
                case 4:
                    lista.mostrarLista();
                    break;
                case 5:
                    activo = false;
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        sc.close();
    }
}
