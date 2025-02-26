package polimorfismo;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
    
    
}
