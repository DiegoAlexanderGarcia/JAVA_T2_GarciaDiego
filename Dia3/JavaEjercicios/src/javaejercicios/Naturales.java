package javaejercicios;

import java.util.Scanner;

public class Naturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (n): ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
