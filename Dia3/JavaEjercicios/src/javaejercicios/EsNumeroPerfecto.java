package javaejercicios;

import java.util.Scanner;

public class EsNumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int sumaDivisores = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }
        
        if (sumaDivisores == num) {
            System.out.println(num + " es un número perfecto.");
        } else {
            System.out.println(num + " no es un número perfecto.");
        }
    }
}