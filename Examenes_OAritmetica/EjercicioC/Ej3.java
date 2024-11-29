package EjercicioC;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        int numero;
        int numInicial;
        int capicua = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Escribe un número: ");
            numero = sc.nextInt();
        } while (numero < 9);

        sc.close();

        numInicial = numero;


        while (numero > 0) {
            capicua = capicua * 10 + numero % 10;
            numero /= 10;
        }

        if (numInicial == capicua) {
            System.out.println("El número es capicua");
        } else {
            System.out.println("El número no es capicua");
        }

    }
}