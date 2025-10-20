package com.edwinrhc.list;

public class Main {
    public static void main(String[] args) {
        LinkedListPractice<Integer> lista = new LinkedListPractice<>();

        // Insertamos valores
        lista.insert(10);
        lista.insert(20);
        lista.insert(30);
        lista.insert(40);

        System.out.println("Lista inicial:");
        lista.printList();

        // Actualizamos un valor
        System.out.println("\nActualizando 20 → 25:");
        lista.update(20, 25);
        lista.printList();

        // Eliminamos un valor
        System.out.println("\nEliminando 30:");
        lista.delete(30);
        lista.printList();

        // Eliminamos el head
        System.out.println("\nEliminando 10 (head):");
        lista.delete(10);
        lista.printList();
    }
}