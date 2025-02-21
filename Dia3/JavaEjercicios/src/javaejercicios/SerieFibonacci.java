package javaejercicios;

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}