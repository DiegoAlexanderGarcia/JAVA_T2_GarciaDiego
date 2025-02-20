package javaejercicios;

import java.util.Scanner;

public class DecimalAHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int decimal = sc.nextInt();
        
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