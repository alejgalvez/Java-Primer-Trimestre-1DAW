package EjercicioC;

public class Ej4 {
    public static void main(String[] args) {

        int anteriorPrimo = 3;
        boolean esPrimo = true;

        for (int i=5; i<100; i+=2) {

            esPrimo = true;


            for (int j=2; j<=i-1; j++) {
                if (i%j==0) {
                    esPrimo = false;
                }
            }


            if (esPrimo) {
                if (i-anteriorPrimo==2) {
                    System.out.println("Primo: "+ anteriorPrimo+ i);
                }

                anteriorPrimo = i;
            }
        }
    }
}