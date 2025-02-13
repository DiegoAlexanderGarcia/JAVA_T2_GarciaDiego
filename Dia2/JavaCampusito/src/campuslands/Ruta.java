package campuslands;

// Clase Ruta
class Ruta {
    private int id;
    private String nombre;
    private int capacidad;

    public Ruta(int id, String nombre, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Capacidad: " + capacidad;
    }
}