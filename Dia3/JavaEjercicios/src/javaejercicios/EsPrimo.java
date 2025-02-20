package javaejercicios;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}