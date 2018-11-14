package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio03 {

    //MOSTRAR EL MAYOR DE DOS NUMEROS
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresar Primer Numero: ");
        int numero1 = scn.nextInt();
        System.out.println("Ingresar Segundo Numero: ");
        int numero2 = scn.nextInt();

        if (numero1 == numero2) {
            System.out.println("Son Iguales");
        } 
        else if (numero1 > numero2) {
            System.out.println("El numero Mayor es: " + numero1);
        } 
        else {
            System.out.println("El numero Mayor es: " + numero2);

        }
    }

}
