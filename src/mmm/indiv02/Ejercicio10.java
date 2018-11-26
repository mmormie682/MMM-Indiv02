package mmm.indiv02;
/*Programa que introducido un número indique si es positivo. Si no lo es finalizará 
el programa pero en caso de que sea mayor que cero mostrará todos los números 
entre los que es divisible.
Ejemplo: si se introduce el 20 mostrará: 10, 5, 4, 2 y 1.*/
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
