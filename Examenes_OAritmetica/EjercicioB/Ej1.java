package EjercicioB;


import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        int numero;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dime un numero: ");
            numero = sc.nextInt();

            if (numero > 0 && numero % 2 == 0)
                System.out.println("Es par");
            else if (numero > 0)
                System.out.println("Es impar");

        } while (numero < 0);
    }
}
