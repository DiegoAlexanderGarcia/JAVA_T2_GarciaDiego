package javaejercicios;

import java.util.Scanner;

public class HexadecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número hexadecimal: ");
        String hex = sc.nextLine().toUpperCase();
        
        // Tabla de conversión de hexadecimal a binario
        String[] tablaBinaria = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                                 "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        
        StringBuilder binario = new StringBuilder();
        
        for (char digito : hex.toCharArray()) {
            int valorDigito;
            if (digito >= '0' && digito <= '9') {
                valorDigito = digito - '0';
            } else if (digito >= 'A' && digito <= 'F') {
                valorDigito = 10 + (digito - 'A');
            } else {
                System.out.println("Entrada no válida.");
                return;
            }
            binario.append(tablaBinaria[valorDigito]);
        }
        
        System.out.println("El número binario equivalente es: " + binario.toString());
    }
}