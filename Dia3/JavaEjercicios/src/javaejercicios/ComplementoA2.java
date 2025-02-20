package javaejercicios;

import java.util.Scanner;

public class ComplementoA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = sc.nextLine();
        
        // Primero, encontrar el complemento a 1
        StringBuilder complementoA1 = new StringBuilder();
        for (char digito : binario.toCharArray()) {
            switch (digito) {
                case '0' -> complementoA1.append('1');
                case '1' -> complementoA1.append('0');
                default -> {
                    System.out.println("Entrada no válida.");
                    return;
                }
            }
        }
        
        // Luego, sumar 1 al complemento a 1
        String complementoA2 = "";
        int carry = 1; // Acarreo inicial
        for (int i = complementoA1.length() - 1; i >= 0; i--) {
            char digito = complementoA1.charAt(i);
            if (digito == '0' && carry == 1) {
                complementoA2 = '1' + complementoA2;
                carry = 0;
            } else if (digito == '1' && carry == 1) {
                complementoA2 = '0' + complementoA2;
            } else {
                complementoA2 = digito + complementoA2;
            }
        }
        
        System.out.println("El complemento a 2 es: " + complementoA2);
    }
}