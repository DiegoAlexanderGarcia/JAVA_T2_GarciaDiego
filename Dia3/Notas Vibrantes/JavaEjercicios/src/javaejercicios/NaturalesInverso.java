package javaejercicios;

import java.util.Scanner;

public class NaturalesInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número (n): ");
        int n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}