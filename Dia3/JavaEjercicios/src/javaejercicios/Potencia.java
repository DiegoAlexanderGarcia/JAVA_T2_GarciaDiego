package javaejercicios;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exp = sc.nextInt();
        
        int resultado = 1;
        for (int i = 1; i <= exp; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + exp + " es: " + resultado);
    }
}