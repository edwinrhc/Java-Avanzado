package com.edwinrhc.queue;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T>{

    private final LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element){
        elements.addLast(element);
        System.out.println("Elemento Agregado.. "+ element);
    }

    public T peek(){
        if(isEmpty()){
            // se intento acceder a un elemento que no existe
            throw new NoSuchElementException("La cola esta vacia");
        }
        return elements.getFirst();
    }

    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacía");
        }
        return elements.removeFirst();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public void print(){
        for(Object o: elements){
            System.out.println(o);
        }
    }


}
