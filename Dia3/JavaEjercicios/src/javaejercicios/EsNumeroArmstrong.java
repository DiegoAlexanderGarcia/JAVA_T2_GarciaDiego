package javaejercicios;

import java.util.Scanner;

public class EsNumeroArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int original = num;
        int sumaCubos = 0;
        
        while (num > 0) {
            int digito = num % 10;
            sumaCubos += Math.pow(digito, 3);
            num /= 10;
        }
        
        if (sumaCubos == original) {
            System.out.println(original + " es un número de Armstrong.");
        } else {
            System.out.println(original + " no es un número de Armstrong.");
        }
    }
}