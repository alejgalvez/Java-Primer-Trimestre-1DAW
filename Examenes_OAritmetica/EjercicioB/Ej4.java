package EjercicioB;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int numero;
        int conten = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime un numero: ");
            numero = sc.nextInt();
        } while (numero < 0);

        while (numero / 10 != 0) {
            conten = numero % 10;
            numero = numero / 10;
            System.out.print(conten);
        }
        conten = numero % 10;
        System.out.print(conten + " Es el nº invertido1");
    }
}

