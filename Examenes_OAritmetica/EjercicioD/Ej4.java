package EjercicioD;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Dime el segundo numero: ");
        int b = sc.nextInt();

        int caja = 0;

        if (b == 0)
            System.out.println("El MCD es " + a);

        else if (b > 0) {

            while (a % b != 0) {

                caja = b;
                b = a % b;
                a = caja;
            }
        }
        System.out.println(b);
    }
}