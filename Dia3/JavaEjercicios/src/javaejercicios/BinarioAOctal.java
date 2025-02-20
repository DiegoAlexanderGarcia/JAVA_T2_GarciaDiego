package javaejercicios;

import java.util.Scanner;

public class BinarioAOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = sc.nextLine();
        
        // Primero, convertir binario a decimal
        int decimal = 0;
        int potencia = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            char digito = binario.charAt(i);
            if (digito == '1') {
                decimal += Math.pow(2, potencia);
            }
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