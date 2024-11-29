package EjercicioA;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nº: ");
        int n = sc.nextInt();
        int suma = 0;
        int nanterior = 0;
        boolean flag = true;

        while (n % 10 != 0 && flag){
            if (n / 10 > 0) {
                suma += n / 10;
                nanterior = n;
                n = n % 10;
            }
            else {
                suma += nanterior % 10;
                flag = false;
            }
        }
        System.out.print("La suma es: " + suma);
    }
}