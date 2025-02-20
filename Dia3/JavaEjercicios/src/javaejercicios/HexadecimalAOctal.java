package javaejercicios;

import java.util.Scanner;

public class HexadecimalAOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número hexadecimal: ");
        String hex = sc.nextLine().toUpperCase();
        
        // Primero, convertir hexadecimal a decimal
        int decimal = 0;
        int potencia = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char digito = hex.charAt(i);
            int valorDigito;
            if (digito >= '0' && digito <= '9') {
                valorDigito = digito - '0';
            } else if (digito >= 'A' && digito <= 'F') {
                valorDigito = 10 + (digito - 'A');
            } else {
                System.out.println("Entrada no válida.");
                return;
            }
            decimal += valorDigito * Math.pow(16, potencia);
            potencia++;
        }
        
        // Luego, convertir decimal a octal
        String octal = "";
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        
        System.out.println("El número octal equivalente es: " + octal);
    }
}