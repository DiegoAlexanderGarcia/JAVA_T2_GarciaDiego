package javaejercicios;

public class NumerosPerfectos {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 10000:");
        
        for (int num = 1; num <= 10000; num++) {
            int sumaDivisores = 0;
            
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sumaDivisores += i;
                }
            }
            
            if (sumaDivisores == num) {
                System.out.println(num);
            }
        }
    }
}