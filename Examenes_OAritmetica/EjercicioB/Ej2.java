package EjercicioB;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int numero;
        int contador = 1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un nº: ");
            numero = sc.nextInt();
        } while (numero < 0);

        while (numero / 10 != 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("Tiene " + contador + " digitos");
    }
}