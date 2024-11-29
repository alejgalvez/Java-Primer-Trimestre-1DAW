package EjercicioC;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        int numero;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Escribe un numero: ");
            numero=sc.nextInt();
        } while (numero<0);

        sc.close();

        //Suma de 1 a n
        for (int i=1; i<=numero ; i++) {
            suma+=i;
        }

        System.out.print("La suma de los números del 1 a %d es:"+ numero+ suma);
    }
}