package javaejercicios;

import java.util.Scanner;

public class OctalAHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número octal: ");
        String octal = sc.nextLine();
        
        // Primero, convertir octal a decimal
        int decimal = 0;
        int potencia = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            char digito = octal.charAt(i);
            decimal += (digito - '0') * Math.pow(8, potencia);
            potencia++;
        }
        
        // Luego, convertir decimal a hexadecimal
        String hex = "";
        String caracteresHex = "0123456789ABCDEF";
        
        while (decimal > 0) {
            int residuo = decimal % 16;
            hex = caracteresHex.charAt(residuo) + hex;
            decimal /= 16;
        }
        
        System.out.println("El número hexadecimal equivalente es: " + hex);
    }
}