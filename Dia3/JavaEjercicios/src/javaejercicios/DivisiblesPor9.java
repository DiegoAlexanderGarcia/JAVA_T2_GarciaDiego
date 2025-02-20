package javaejercicios;

public class DivisiblesPor9 {
    public static void main(String[] args) {
        int numero = 0;
        
        System.out.println("Números entre 100 y 200 divisibles por 9:");

        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                numero += i;
            }
        }
        
        System.out.println("La suma de los números divisibles por 9 es: " + numero);
    }
}