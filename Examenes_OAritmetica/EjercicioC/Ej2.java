package EjercicioC;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        int num;
        int mayor = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número: "+ i);
            num = sc.nextInt();

            if (num > mayor) {
                mayor = num;
            }
        }

        sc.close();

        System.out.print("El número mayor es: "+ mayor);
    }
}