package com.edwinrhc.list;

public class Node<T> {

    T data; // Dato que guarda el nodo
    Node<T> next; // referencia al siguiente nodo

    public Node(T data) {
        this.data = data;
        this.next = null; // al inicio no apunta a nadie
    }
}
