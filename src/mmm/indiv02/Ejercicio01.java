package mmm.indiv02;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DETERMINAR SI EL NUMERO INGRESADO ES POSITIVO O NEGATIVO

        int num;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el numero: ");
        num = teclado.nextInt();
        if (num < 0) {
            System.out.println(" el numero es negativo");
        } 
        else {
            System.out.println(" el numero es positivo");
        }
    }

}
