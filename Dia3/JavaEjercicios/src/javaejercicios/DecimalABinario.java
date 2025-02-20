package javaejercicios;

import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int decimal = sc.nextInt();
        
        String binario = "";
        
        while (decimal > 0) {
            binario = (decimal % 2) + binario;
            decimal /= 2;
        }
        
        System.out.println("El número binario equivalente es: " + binario);
    }
}