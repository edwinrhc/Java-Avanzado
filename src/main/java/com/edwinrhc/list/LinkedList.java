package com.edwinrhc.list;

public class LinkedList<T> {

    private Node<T> head; // referencia al primer nodo de la lista
    //Es generíca (<T>) así que puede almacenar cualquier tipo (Integer, String, etc.)
    // head es el primer nodo de la lista. Si está en null, significa que la lista está vacía

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void add(T data){
        Node<T> newNode = new Node<>(data); // se crea un nuevo nodo con el dato
        // Cada vez que llamas "add", se crea un nodo (Node) que guarda el valor y un puntero al siguiente nodo
        if(head == null){
            head = newNode; //Si la lista está vacía, el nuevo nodo es el primero
        }else{
            Node<T> current = head; // Empezamos desde el inicio
            while(current.next != null){
                current = current.next; // recorremos hasta el último nodo
            }
            current.next = newNode; // enlazamos el último nodo al nuevo
        }
    }

    //Método  que recorre e imprime todos los elementos de la lista
    public void printList(){
        Node<T> current = head; // apuntamos al primer nodo (head)
        while(current != null){ // _Recorremos mientras haya nodos
            System.out.println("Elemento: " + current.data); // Imprime el dato del nodo actual
            current = current.next; // Avanzamos al siguiente nodo
        }
    }

    // Método que busca un valor (olData) y lo reemplaza por el nuevo valor (newData)
    public void update(T olData, T newData){
        Node<T> current = head; // Empezamos desde el primer nodo
        while(current != null){ // Recorremos mientras existan nodos
            if(current.data.equals(olData)){ // Si el dato coincide con el que queremos cambiar
                current.data = newData; // Actualizamos el dato
                return; // Salimos porque ya actualizamos el dato
            }
            current = current.next; // Avanzamos al siguiente nodo
        }
    }

    // Método que elimina un elemento de la lista
    public void delete(T data){
        if(head == null){ // Lista vacia
            return; // No hay nada que eliminar
        }
        if(head.data.equals(data)){ // El dato a borrar está en el primer nodo
            head = head.next; // Se elimina el primer nodo moviendo head al siguiente
            return;
        }
        // El dato está en otro nodo más adelante
        Node<T>  current = head.next; // Empezamos desde el segundo nodo
        Node<T> previous = head; // Guardamos el nodo anterior al current

        // Recorremos hasta encontrar el dato o llegar al fial
        while(current != null && !current.data.equals(data)){
            previous = current; // Avanzamos el puntero "previus"
            current = current.next; // Avanzamos el puntero "current"
        }
        // Si current es null -> no se encontró el dato, no hay nada que borrar
        if(current != null){
            return;
        }
        // Caso encontrado -> desvinculamos el nodo actual de la lista
        previous.next = current.next;
        // "Saltamos" el nodo actual y apuntamos al siguiente, borrando así el nodo
    }
}
