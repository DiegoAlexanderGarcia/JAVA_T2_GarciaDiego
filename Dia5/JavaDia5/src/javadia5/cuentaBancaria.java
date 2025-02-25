package javadia5;
public class cuentaBancaria {
    private String titular;
    private double saldo;

    public cuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0){
            saldo -= cantidad;
            System.out.println("Transaccion realizada con exito, su saldo es: " + saldo);
        }else{
            System.err.println("fondo insuficiente o cantidad incvalida");
        }
    }
    
    public void depositar (double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Transaccion realizada con exito, su saldo es: "+ saldo);
        }else {
            System.err.println("la cantidad no es valida,imgresa un numero positivo");
        }
    }
    
}
