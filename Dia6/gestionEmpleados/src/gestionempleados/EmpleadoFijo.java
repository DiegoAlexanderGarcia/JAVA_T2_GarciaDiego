package gestionempleados;

public class EmpleadoFijo extends Empleado {

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        return  getSalario() * 0.20;
    }
    
    public double getSalario(){
        return super.calcularBonificacion() * 0.10;
    }
    
}
