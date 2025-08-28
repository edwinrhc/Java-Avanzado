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
}
