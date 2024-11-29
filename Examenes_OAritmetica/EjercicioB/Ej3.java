package EjercicioB;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int numero;
        int a = 0;
        int b = 1;
        int suma = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Cuantos numeros hay de sucesión: ");
            numero = sc.nextInt();
        } while (numero < 0);
        System.out.print("0");

        for (int i = 1; i < numero; i++) {
            suma = a + b;
            System.out.print("," + suma);
            b = a;
            a = suma;
        }
    }
}