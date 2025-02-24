package javahospital;

public class Persona {
    // Atributos
    private String nombreCompleto;
    private String direccion;

    // Constructor
    public Persona(String nombreCompleto, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}