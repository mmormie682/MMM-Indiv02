package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        //MOSTRAR POR PANTALLA "EL NUMERO ES CERO"
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el numero: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println(" el numero es positivo ");
        } 
        else if (num < 0) {
            System.out.println(" el numero no es negativo");
        } 
        else {
            System.out.println(" el numero es cero ");
        }

    }

}
