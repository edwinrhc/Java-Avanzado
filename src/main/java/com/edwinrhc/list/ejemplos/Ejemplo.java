package com.edwinrhc.list.ejemplos;

import java.util.LinkedList;


public class Ejemplo {

    public static void main(String[] args) {

//        //Ejemplo01
//        System.out.println("======================");
//        System.out.println("Ejemplo 1");
//        System.out.println("======================");
//        ListarFruta();
//
//        System.out.println("======================");
//        System.out.println("Ejemplo 2");
//        System.out.println("======================");
//        //Ejemplo02
//        InicioFin();
//
//        System.out.println("======================");
//        System.out.println("Ejemplo 3");
//        System.out.println("======================");
//        //Ejemplo03
//        Fifo();

        System.out.println("======================");
        System.out.println("Ejemplo 4");
        System.out.println("======================");
        //Ejemplo04
        eliminarElementos();

    }

    // Crear y recorrer una LinkedList
   static void ListarFruta(){
        LinkedList<String> frutas = new LinkedList<>();
        frutas.add("fresa");
        frutas.add("manzana");
        frutas.add("pera");

        for(String frut: frutas){
            System.out.println(frut);
        }

    }

    // Insertar al inicio y al final
    static void InicioFin(){
        LinkedList<String> data = new LinkedList<>();
        data.add("Edwin");
        data.add("Ricardo");
        data.add("Dayiro");

        data.addFirst("Primero");
        data.addLast("Ultimo");

        System.out.println(data);

        int cantidad = data.size();
        System.out.println("Cantidad de elementos: " + cantidad);


    }

    // Queque - FIFO Primero en entrar y primero en salir
    static void Fifo(){
        LinkedList<String> cola = new LinkedList<>();
        cola.offer("Cliente 1");
        cola.offer("Cliente 2");
        cola.offer("Cliente 3");
        cola.offer("Cliente 4");
        cola.offer("Cliente 5");

        System.out.println("Cola: " + cola);
        //Atender al primero (Dequeque)
        String atendido = cola.poll();
        System.out.println("Atendido: " + atendido);
        System.out.println("Cola actual: " + cola);
    }

    // Eliminar elementos
    static void eliminarElementos(){
        LinkedList<String> books = new LinkedList<>();
        books.add("Java");
        books.add("Clean Code");
        books.add("Free Java");
        books.add("Free Code");
        books.add("Pensando en Java");

        int cantidad = books.size();

        System.out.println("Cantidad de elementos: " + cantidad);
        for(String book: books){
            System.out.println("Libros: " + book);
        }

        //Por índice
        books.remove(1);
        // Por dato
        books.remove("Java");

        int resultado = books.size();
        if(resultado != cantidad){
            System.out.println("Cantidad de libros es de: " + resultado);
        }


    }

    // Sistema de turnos
    static void sistemTurnos(){
        LinkedList<String> personas = new LinkedList<>();

        personas.offer("Ana");
        personas.offer("Ricardo");
        personas.offer("Dayiro");
        personas.offer("Yassiel");
        personas.offer("Edwin");

        while(!personas.isEmpty()){
            String persona = personas.poll();  // Atiende al primero en la cola
            System.out.println("Atendiendo a: " + persona);
        }


    }

}
