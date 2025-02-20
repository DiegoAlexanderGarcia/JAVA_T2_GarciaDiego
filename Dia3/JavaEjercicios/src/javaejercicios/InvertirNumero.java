package javaejercicios;

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int invertido = 0;
        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        System.out.println("El número invertido es: " + invertido);
    }
}
