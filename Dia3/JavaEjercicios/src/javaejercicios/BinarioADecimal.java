package javaejercicios;

import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número binario (como entero): ");
        int binario = sc.nextInt();

        int decimal = 0; // Almacena el resultado final
        int posicion = 0;

        if (binario > 0) {
            // Extraer el último dígito
            int digito = binario % 10;
            decimal += digito * Math.pow(2, posicion); // Calcular su contribución al decimal
            posicion++; // Incrementar la posición
            
            // Eliminar el último dígito procesado
            binario /= 10;
        }
        
        if (binario > 0) {
            int digito = binario % 10;
            decimal += digito * Math.pow(2, posicion);
            posicion++;
            binario /= 10;
        }
        
        if (binario > 0) {
            int digito = binario % 10;
            decimal += digito * Math.pow(2, posicion);
            posicion++;
            binario /= 10;
        }
        
        if (binario > 0) {
            int digito = binario % 10;
            decimal += digito * Math.pow(2, posicion);
            posicion++;
            binario /= 10;
        }
        
        if (binario > 0) {
            int digito = binario % 10;
            decimal += digito * Math.pow(2, posicion);
            posicion++;
            binario /= 10;
        }
        
        System.out.println("El número decimal equivalente es: " + decimal);
    }
}