package javaejercicios;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}