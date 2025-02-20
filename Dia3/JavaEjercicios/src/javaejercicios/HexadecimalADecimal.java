package javaejercicios;

import java.util.Scanner;

public class HexadecimalADecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número hexadecimal: ");
        String hex = sc.nextLine().toUpperCase(); // Leer el número hexadecimal como cadena
        
        int decimal = 0;
        int potencia = 0; // Potencia de 16
        
        // Recorrer el número hexadecimal desde el final hacia el inicio
        for (int i = hex.length() - 1; i >= 0; i--) {
            char digito = hex.charAt(i);
            int valorDigito;
            
            // Convertir el dígito hexadecimal a su valor decimal
            if (digito >= '0' && digito <= '9') {
                valorDigito = digito - '0';
            } else if (digito >= 'A' && digito <= 'F') {
                valorDigito = 10 + (digito - 'A');
            } else {
                System.out.println("Entrada no válida.");
                return;
            }
            
            // Calcular la contribución del dígito al número decimal
            decimal += valorDigito * Math.pow(16, potencia);
            potencia++;
        }
        
        System.out.println("El número decimal equivalente es: " + decimal);
    }
}