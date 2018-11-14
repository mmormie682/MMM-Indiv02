package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        //OPERACIONES DE SUMA, RESTA Y MULTIPLICACION

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resultado;

        System.out.println("Ingrese Numero 1");
        num1 = sc.nextInt();

        System.out.println("Ingrese Numero 2");
        num2 = sc.nextInt();

        if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es:" + resultado);
        } else if (num1 < num2) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es:" + resultado);
        } 
        else
        {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion es:" + resultado);

        }

    }

}
