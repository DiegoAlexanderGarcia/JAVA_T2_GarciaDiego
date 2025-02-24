package javahospital;

import javahospital.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    // Atributos
    private final String nombre;
    private final List<Empleado> empleados;

    // Constructor
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>(); // Inicializa la lista de empleados
    }

    // Método para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    void agregarPersonal(Enfermera enfermera) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}