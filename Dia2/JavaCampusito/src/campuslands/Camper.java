package campuslands;

class Camper {
    private int id;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String acudiente;
    private String telefono;
    private String estado;
    private String riesgo;

    public Camper(int id, String nombres, String apellidos, String direccion, String acudiente, String telefono, String estado, String riesgo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.acudiente = acudiente;
        this.telefono = telefono;
        this.estado = estado;
        this.riesgo = riesgo;
    }

    public int getId() {
        return id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombres: " + nombres + ", Apellidos: " + apellidos + ", Estado: " + estado;
    }
}