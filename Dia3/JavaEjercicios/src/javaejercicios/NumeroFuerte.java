package javaejercicios;

import java.util.Scanner;

public class NumeroFuerte {
    public static int factorial(int num){
        int facto= 1; 
        for (int i = 1; i <= num; i++)facto *= i;
        return facto;
    };
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingresa un numero: ");
        int numero = ingreso.nextInt(), sumaN = 0, temp = numero;
        while (temp > 0){
            sumaN += factorial(temp % 10);
            temp /= 10;
        }
        System.out.println(numero + (sumaN == numero ? "es" : "no es") + "un nomero fuerte");
     }
}

