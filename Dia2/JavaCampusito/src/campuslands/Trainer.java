package campuslands;

// Clase Trainer
class Trainer {
    private final int id;
    private final String nombre;
    private final String especialidad;

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