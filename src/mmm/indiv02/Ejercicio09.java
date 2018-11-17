package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        //MOSTRAR LAS TABLAS DE MULTIPLICAR
        int numero;
        String salir;
        salir = "s";

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el numero de la tabla de multiplicar");
            numero = teclado.nextInt();

            for (int c = 1; c <= 10; c = c + 1) {
                int resultado = numero * c;
                System.out.println(numero + " x " + c + " = " + resultado);
            }
        } while (salir.equals("s"));
    }
}