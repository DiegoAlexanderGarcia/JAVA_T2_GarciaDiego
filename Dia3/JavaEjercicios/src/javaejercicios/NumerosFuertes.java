package javaejercicios;

public class NumerosFuertes {
    public static void main(String[] args) {
        System.out.println("Números fuertes entre 1 y 100000:");
        
        for (int num = 1; num <= 100000; num++) {
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
                System.out.println(original);
            }
        }
    }
}
