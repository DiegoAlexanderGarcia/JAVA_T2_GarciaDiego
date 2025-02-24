package javadia5;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    
    public void setSalario(double salario){
        if (salario > 0)
    }
    
    public String getNombre(){
        return "Nombre empleado:"+nombre;
    }
    
    public int getId(){
        return id;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void mostrarInformacion (){
        if (salario > 0){
            System.out.println("Nombre Empleado:" + nombre + "ID empleado: " + id + "Salario mensual: " + salario);
        }else{
            System.err.println("Nombre Empleado:" + nombre + "ID empleado: " + id +"Usted no cuenta con saldo en sucuenta!!");
        }              
    }
}
