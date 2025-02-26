package polimorfismo;

public class main {

    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Tundra", 4);
        Vehiculo moto = new Motocicleta("Yamaha", " R1M", "Deportivo");
        
        System.out.println("Detalles del Coche:");
        coche.mostrarDetalles();
        
        System.out.println("\nDetalles de la Motocicleta:");
        moto.mostrarDetalles();
    }
    
}
