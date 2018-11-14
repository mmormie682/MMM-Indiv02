package mmm.indiv02;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
//SWITCH OPERACIONES

        Scanner entrada = new Scanner(System.in);

        int respuesta;
        int num1;
        int num2;
        float resultado;

        System.out.println("Mostrar el numero 1");
        num1 = entrada.nextInt();

        System.out.println("Mostrar el numero 2");
        num2 = entrada.nextInt();

        System.out.println("Menu de Operaciones");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");

        respuesta = entrada.nextInt();

        switch (respuesta) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);

                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicaciòn es: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado de la divisiòn es:" + resultado);
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Este numero no coincide con ninguna de las opciones disponibles");
                break;
        }
    }
}
