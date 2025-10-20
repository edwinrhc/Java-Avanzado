package com.edwinrhc.list.ejercicio01;

import java.util.LinkedList;
import java.util.Scanner;

// Sistema de turnos en bancos
public class Turnos {

    public static void main(String[] args) {

        LinkedList<String> turnos = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int contador = 1; // Para generar turnos T001, T002 ...
        boolean activo = true;

        while (activo) {
            System.out.println("\n-- SISTEMA DE TURNOS ---");
            System.out.println("1. Generar nuevo turno");
            System.out.println("2. Atender siguiente turno");
            System.out.println("3. Mostrar cola de turnos");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos buffer

            switch (opcion) {
                case 1:// Generar Turnos
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    String numeroTurno = String.format("T%03d", contador++);
                    String turnoCompleto = numeroTurno + " - " + nombre;
                    turnos.offer(turnoCompleto);
                    System.out.println("Turno generado: " + numeroTurno);
                    break;

                case 2: // Atender turno
                    if (!turnos.isEmpty()) {
                        System.out.println("Atendiendo: " + turnos.poll());
                    } else {
                        System.out.println("No hay turnos pendientes");
                    }
                    break;

                case 3: // Mostrar lista
                    System.out.println("Turnos en espera:" + turnos);
                    break;

                case 4: // Salir
                    activo = false;
                    System.out.println("Sistema finalizado");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        }
        sc.close();
    }
}
