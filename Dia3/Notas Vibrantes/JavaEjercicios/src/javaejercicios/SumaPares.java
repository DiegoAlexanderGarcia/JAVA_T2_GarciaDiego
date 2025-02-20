package javaejercicios;

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (n): ");
        int n = sc.nextInt();
        
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
}