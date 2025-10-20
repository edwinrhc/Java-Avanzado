package com.edwinrhc.stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(200);

        Stack<String> names = new Stack<>();
        names.push("Edwin");
        names.push("Ricardo");
        names.push("Juan");
        names.push("Maria");

        integerStack.print();

        System.out.println("elemento en la cima es:" + integerStack.peek());

        System.out.println("Eliminar un elemento es: "+ integerStack.pop());
     integerStack.print();

    }
}
