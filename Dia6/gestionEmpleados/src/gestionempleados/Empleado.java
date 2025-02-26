package gestionempleados;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double calcularBonificacion(){
        return salario * 0.10;
    }
    
    public String getNombre(){
        return nombre;
    }
}
