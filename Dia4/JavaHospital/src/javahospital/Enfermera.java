package javahospital;

import javahospital.Empleado;

public class Enfermera extends Empleado {
    // Constructor
    public Enfermera(String nombreCompleto, String direccion, String fechaVinculacion, double salario) {
        super(nombreCompleto, direccion, fechaVinculacion, salario); // Llama al constructor de Empleado
    }
}