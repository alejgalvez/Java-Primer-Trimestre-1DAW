package EjercicioD;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de numeros a generar:");
        int cantidad = sc.nextInt();
        int triangular = 0;

        for (int i = 1; i <= cantidad; i++) {

            triangular = triangular + i;
            System.out.println(triangular);
        }
    }
}