package javaejercicios;

import java.util.Scanner;

public class ComplementoA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = sc.nextLine();
        
        StringBuilder complemento = new StringBuilder();
        
        for (char digito : binario.toCharArray()) {
            if (digito == '0') {
                complemento.append('1');
            } else if (digito == '1') {
                complemento.append('0');
            } else {
                System.out.println("Entrada no válida.");
                return;
            }
        }
        
        System.out.println("El complemento a 1 es: " + complemento.toString());
    }
}