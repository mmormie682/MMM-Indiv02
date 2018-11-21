package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int numero;
     

        Scanner teclado = new Scanner(System.in);
        System.out.println();
        numero = teclado.nextInt();
        
        if (numero > 0) {
            System.out.println(" el numero es positivo ");

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) 
                System.out.println(i);
            }
        }

    }
}
