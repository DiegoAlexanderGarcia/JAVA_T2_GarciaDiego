import javahospital.Empleado;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Empleado {
    // Atributos adicionales
    private final boolean esLider;
    private final List<Doctor> equipo;

    // Constructor
    public Doctor(String nombreCompleto, String direccion, String fechaVinculacion, double salario, boolean esLider) {
        super(nombreCompleto, direccion, fechaVinculacion, salario); // Llama al constructor de Empleado
        this.esLider = esLider;
        this.equipo = new ArrayList<>(); // Inicializa el equipo
    }

    // Método para agregar un miembro al equipo (solo si es líder)
    public void agregarMiembroEquipo(Doctor doctor) {
        if (esLider) {
            equipo.add(doctor);
        } else {
            System.out.println("Solo un líder puede agregar miembros al equipo.");
        }
    }

    // Getters
    public boolean isEsLider() {
        return esLider;
    }

    public List<Doctor> getEquipo() {
        return equipo;
    }
}