package gestionempleados;

public class EmpleadoPorHoras extends Empleado {
    private int HorasTrabajadas;

    public EmpleadoPorHoras(String nombre, double salario, int HorasTrabajadas) {
        super(nombre, salario);
        this.HorasTrabajadas = HorasTrabajadas;
    }

    @Override
    public double calcularBonificacion() {
        if (HorasTrabajadas > 160) {
            return getSalario() * 0.15;
        }else{
            return getSalario() * 0.05;
        }
    }

    private double getSalario(){
        return super.calcularBonificacion() * 10;
    }
    
}
