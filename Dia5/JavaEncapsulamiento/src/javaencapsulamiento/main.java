package javaencapsulamiento;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Persona p1 = new Persona("Zully", 19);
        Persona p1 = new Persona();
        
        Scanner sc = new Scanner (System.in);
        
        p1.setNombre("Alejandra");
        p1.setEdad(0);
        System.out.println(p1.getNombre());
        
        CuentaBancaria c1 = new CuentaBancaria("ALSHD182343", 12000000);

        System.out.println(c1.getSaldo());
        
        c1.depositar(2500000);
        System.out.println(c1.getSaldo());
        
        c1.retirar(9000000);
        System.out.println(c1.getSaldo());
        
    }
    
}
