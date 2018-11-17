package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        //Muestre la tabla de multiplicar de un número introducido por teclado.
        int numero=9;
         
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero de la tabla de multiplicar");
       numero=teclado.nextInt();

        for (int c = 1; c <= 10; c = c + 1) {
            int resultado=numero*c;
            System.out.println(numero+" x "+c+" = "+resultado);
        }
    }
}
 