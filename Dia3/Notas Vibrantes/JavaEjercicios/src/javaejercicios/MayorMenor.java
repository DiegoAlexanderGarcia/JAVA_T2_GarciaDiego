package javaejercicios;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        char continuar;
        
        do {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();
            
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
            
            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        System.out.println("El número más grande es: " + mayor);
        System.out.println("El número más pequeño es: " + menor);
    }
}