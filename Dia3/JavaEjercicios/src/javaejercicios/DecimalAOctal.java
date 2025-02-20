package javaejercicios;

import java.util.Scanner;

public class DecimalAOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int decimal = sc.nextInt();
        
        String octal = "";
        
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        
        System.out.println("El número octal equivalente es: " + octal);
    }
}