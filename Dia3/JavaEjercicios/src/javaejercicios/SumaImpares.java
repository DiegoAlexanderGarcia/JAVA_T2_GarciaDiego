package javaejercicios;

import java.util.Scanner;

public class SumaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (n): ");
        int n = sc.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= n; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números impares es: " + suma);
    }
}