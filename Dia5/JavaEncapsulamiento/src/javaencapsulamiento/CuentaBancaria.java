package javaencapsulamiento;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria() {
    }
   
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar (double cantidad){
        if (cantidad > 0){
            saldo = saldo + cantidad;
            System.err.println("El deposito fue realizado!!");
        }else{
            System.err.println("La cantidad a depositar debe ser positiva");
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo = saldo - cantidad;
            System.err.println("Su retiro fue realizado");
        }else if(cantidad > saldo){
            System.err.println("No tiene los fondos suficientes");
        }else{
            System.err.println("Por favor debe ingresar una cantidad valida");
        }
    }
}
