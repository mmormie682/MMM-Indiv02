package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println();
        numero = teclado.nextInt();

        for (numero = numero - 1; numero >= 1; numero--) {
            if (numero % numero == 0) {
                System.out.println("El numero" + numero + "es divisible entre:" + numero);
            }
        }

    }
}
