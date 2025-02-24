package javahospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Paciente extends Persona {
    // Atributos adicionales
    private final String fechaNacimiento;
    private int edad;
    private final String diagnostico;

    // Constructor
    public Paciente(String nombreCompleto, String direccion, String fechaNacimiento, String diagnostico) {
        super(nombreCompleto, direccion); // Llama al constructor de Persona
        this.fechaNacimiento = fechaNacimiento;
        this.diagnostico = diagnostico;
        calcularEdad(); // Calcula la edad automáticamente
    }

    // Método para calcular la edad
    private void calcularEdad() {
        int anioNacimiento = Integer.parseInt(fechaNacimiento.split("-")[0]); // Extrae el año
        this.edad = 2023 - anioNacimiento; // Suponemos que el año actual es 2023
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    void asignarPabellon(String pabellón_Norte) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
