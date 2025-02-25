package javadia5;

public class CuentaAhorro extends cuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, String titular, double saldo) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicaInteres(){
        double interes = getSaldo() * tasaInteres / 100;
        depositar(interes);
        System.out.println("Interes aplicado, tu saldo es: "+ getSaldo());
    }
}
