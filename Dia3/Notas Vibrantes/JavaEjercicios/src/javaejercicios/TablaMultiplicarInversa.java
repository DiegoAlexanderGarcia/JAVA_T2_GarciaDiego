package javaejercicios;

import java.util.Scanner;

public class TablaMultiplicarInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número para la tabla de multiplicar: ");
        int num = sc.nextInt();
        
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}