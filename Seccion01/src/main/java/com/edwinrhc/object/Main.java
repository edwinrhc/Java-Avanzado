package com.edwinrhc.object;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



//        Box<String> stringBox = new Box<>("Edwin");
//
//        System.out.println(stringBox.getValue());
//
//        Box<Integer> integerBox = new Box<>(10);
//        System.out.println(integerBox.getValue());
//
//        Utility.printItem("Ricardo",2);
//        Utility.printItem(30);
//
//        double resultado = MathUtils.sum(40,20);
//        System.out.println("El resultado es: " + resultado);

        List<String> names = new ArrayList<>();
        names.add("Edwin");
        names.add("Ricardo");
        names.add("Juan");
        names.add("Maria");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        printList(names);
        printList(numbers);

        sumNumbers(numbers);

        addNumber(numbers);


    }

    // Método que recibe una lista de cualquier tipo  ( comodín '?')
    // No se sabe el tipo exacto, por eso solo podemos leer ( no añadir)
    public static void printList(List<?> list){
        for (Object o: list){
            // Se imprime cada elemento como Object, porque no sabemos el tipo real
            System.out.println(o);
        }
    }
    // Método que recibe una lista de cualquier subtipo de Number (Integer, Double, Float, etc.)
    // Se utiliza '? extends Number' -> esto significa "puedo leer como Number, pero no añadir"
    public static void sumNumbers(List<? extends Number> numbers){
        double sum = 0;
        for (Number num: numbers){
            // Accedemos de forma segura porque sabemos que son Numbers o subTipos
            sum += num.doubleValue();
        }
        // Nota imporntante: con '? extends ' NO podemos añadir elementos, solo leer.
        System.out.println("La suma es: " + sum);
    }

    // Método que recibe una lista que acepta Integer o cualquier supertipo de Integer (Number, Object)
    // Se utiliza '? super Integer' -> esto significa "puedo añadir enteros de forma seguro"
    public static void addNumber(List<? super Integer> numbers){
        // Podemos añadir enteros sin problema
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);

        // Al recuperar, el compilador solo garantiza que es Object,
        // Porque no sabe si la lista era List<Integer>, List<Number> o List<Object>
        Object num = numbers.get(3);

        System.out.println(num);

    }
}