package EjercicioA;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial = factorial * i;
        }
        System.out.print("El factorial es: " + factorial);
    }
}