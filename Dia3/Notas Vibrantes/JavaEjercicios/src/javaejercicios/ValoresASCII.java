package javaejercicios;

public class ValoresASCII {
    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            System.out.println("Código ASCII " + i + ": " + (char)i);
        }
    }
}