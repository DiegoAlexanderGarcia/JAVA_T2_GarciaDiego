package javadia5;

public class PruebaCuentaAhorro {
    public static void main(String[] args) {        
        CuentaAhorro cuenta = new CuentaAhorro (0.05, "Juan Garcia", 5000000 );
        
        System.out.println("""
                           
                           ....Informacion de La Cuenta....
                           Titular: """+ cuenta.getTitular() + "\nSaldo: "+ cuenta.getSaldo());
        
        cuenta.depositar(2500000);
        cuenta.retirar(1500000);
        
        cuenta.aplicaInteres();
        
        System.out.println("""
                           
                           ....Informacion de La Cuenta....
                           Titular: """+ cuenta.getTitular() + "\nSaldo: "+ cuenta.getSaldo());
    }
}