package javaejercicios;

import java.util.Scanner;

public class NumeroFuerte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int original = num;
        int sumaFactoriales = 0;
        
        while (num > 0) {
            int digito = num % 10;
            int factorial = 1;
            for (int i = 1; i <= digito; i++) {
                factorial *= i;
            }
            sumaFactoriales += factorial;
            num /= 10;
        }
        
        if (sumaFactoriales == original) {
            System.out.println(original + " es un número fuerte.");
        } else {
            System.out.println(original + " no es un número fuerte.");
        }
    }
}