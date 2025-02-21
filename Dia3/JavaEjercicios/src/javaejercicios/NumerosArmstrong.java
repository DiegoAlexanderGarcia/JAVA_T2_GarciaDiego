package javaejercicios;

public class NumerosArmstrong {
    public static void main(String[] args) {
        System.out.println("Números de Armstrong entre 1 y 1000:");
        
        for (int num = 1; num <= 1000; num++) {
            int original = num;
            int sumaCubos = 0;
            
            while (num > 0) {
                int digito = num % 10;
                sumaCubos += Math.pow(digito, 3);
                num /= 10;
            }
            
            if (sumaCubos == original) {
                System.out.println(original);
            }
        }
    }
}