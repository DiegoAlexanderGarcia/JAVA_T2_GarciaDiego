package javaejercicios;

import java.util.Scanner;

public class OctalADecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número octal: ");
        String octal = sc.nextLine();
        
        int decimal = 0;
        int potencia = 0;
        
        for (int i = octal.length() - 1; i >= 0; i--) {
            char digito = octal.charAt(i);
            decimal += (digito - '0') * Math.pow(8, potencia);
            potencia++;
        }
        
        System.out.println("El número decimal equivalente es: " + decimal);
    }
}