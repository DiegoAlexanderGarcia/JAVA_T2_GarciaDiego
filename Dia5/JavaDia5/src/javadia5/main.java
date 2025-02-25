package javadia5;

public class main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", 129388, 5000000);
        e1.mostrarInformacion();
        
        e1.setNombre("Juan Garcia");
        e1.setSalario(10000000);
        e1.setSalario(-5000000);
        
        e1.mostrarInformacion();
    
    }
    
}
