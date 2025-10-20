package com.edwinrhc.list.ejercicio01;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Simular un historial de páginas usando LinkedList<String>
 * Cada vez que el usuario visita una página nueva, esta se agrega al final de la lista
 *  Permitir:
 *     - Agregar una página nueva
 *     - Mostrar historial completo.
 *     - Retroceder (eliminar la última página visitada)
 *     - Salir
 */
public class HistorialPaginasVisitadas {

    // Usamos LinkedList para almacenar el historial
    private LinkedList<String> historial = new LinkedList<>();

    // Agregar una página al historial
    public void visitarPagina(String pagina){
        historial.add(pagina);
        System.out.println("Página visitada:" + pagina);
    }

    // Mostrar el historial de páginas
    public void mostrarHistorial(){
        if(historial.isEmpty()){
            System.out.println("No hay páginas en el historial");
        }else{
            System.out.println("Historial de páginas: ");
            int i = 1;
            for(String page: historial){
                System.out.println(i++ + ". " + page);
            }
        }
    }

    // Retroceder a la página anterior
    public void retroceder(){
        if(!historial.isEmpty()){
            String paginaEliminada = historial.pollLast();
            System.out.println("Retrocediendo... eliminadas: " + paginaEliminada);
        }else{
            System.out.println(" No hay páginas para retroceder");
        }
    }

//    Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HistorialPaginasVisitadas navegador = new HistorialPaginasVisitadas();
        boolean activo = true;

        while(activo){
            System.out.println("\n--- HISTORIAL DE PÁGINAS ---");
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Retroceder");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion){
                case 1:
                    System.out.println("Ingrese la página: ");
                    String pagina = sc.nextLine();
                    navegador.visitarPagina(pagina);
                    break;
                case 2:
                    navegador.mostrarHistorial();
                    break;
                case 3:
                    navegador.retroceder();
                    break;
                case 4:
                    activo = false;
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    System.out.println(" Opción inválida, intenta de nuevo.");
            }
        }
        sc.close();

    }

}
