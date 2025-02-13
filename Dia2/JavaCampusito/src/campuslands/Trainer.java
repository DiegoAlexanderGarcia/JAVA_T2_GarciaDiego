package campuslands;

// Clase Trainer
class Trainer {
    private int id;
    private String nombre;
    private String especialidad;

    public Trainer(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad;
    }
}