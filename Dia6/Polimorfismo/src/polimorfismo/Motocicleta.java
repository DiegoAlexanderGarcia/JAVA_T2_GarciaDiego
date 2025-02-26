package polimorfismo;

public class Motocicleta extends Vehiculo {
    private String tipoManubrio;

    public Motocicleta(String marca, String modelo, String tipoManubrio) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Tipo de manubrio: " + tipoManubrio);
    }
}
