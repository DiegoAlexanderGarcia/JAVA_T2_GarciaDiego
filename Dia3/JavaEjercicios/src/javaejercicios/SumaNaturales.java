package javaejercicios;

import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (n): ");
        int n = sc.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }
}