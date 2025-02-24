package javahospital;

public class Empleado extends Persona {
    // Atributos adicionales
    private final String fechaVinculacion;
    private final double salario;

    // Constructor
    public Empleado(String nombreCompleto, String direccion, String fechaVinculacion, double salario) {
        super(nombreCompleto, direccion); // Llama al constructor de Persona
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
    }

    // Getters
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public double getSalario() {
        return salario;
    }
}