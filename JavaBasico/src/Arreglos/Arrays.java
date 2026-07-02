package Arreglos;

public class Arrays {
    public static void main(String[] args) {
        int[] notas = {12,15,18,20,41};
        int suma = 0;

        for(int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedio = suma / notas.length;
        System.out.println("El promedio de las notas es: " + promedio);


    }
}
