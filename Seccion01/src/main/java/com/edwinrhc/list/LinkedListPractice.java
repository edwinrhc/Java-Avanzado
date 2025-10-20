package com.edwinrhc.list;

public class LinkedListPractice<T> {

    Node<T> head; // Puntero al primer nodo de la lista

    // Insertar al final
    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }


    // Imprimir lista
    public void printList() {
        Node<T> current = head; // Inicio en el primer nodo
        while (current != null) { // Mientras haya nodos
            System.out.println("Elemento: " + current.data);
            current = current.next; // Avanza
        }
    }


    // Actualizar data
    public void update(T oldData, T newData){
        Node<T> current = head;
        while(current != null){
            if(current.data.equals(oldData)){
                current.data = newData; // Cambiamos el dato
                return;//salimos
            }
            current = current.next;
        }
    }

    public void delete(T data){
        if(head == null){ // Lista vacia
            return;
        }
        if(head.data.equals(data)){ // Eliminar primer nodo
            head = head.next;
            return;
        }
        Node<T> current = head.next;
        Node<T> previous = head;

        while(current != null &&  !current.data.equals(data)){
            previous = current;
            current  = current.next;
        }
        if(current == null){ // No encontrado
            return;
        }
        previous.next = current.next; // Saltamos el nodo encontrado
    }


}
