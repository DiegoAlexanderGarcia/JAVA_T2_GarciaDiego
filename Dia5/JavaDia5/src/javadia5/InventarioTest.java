package javadia5;

public class InventarioTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("001", "laptop", 10, 1500000);
        Producto p2 = new Producto("002", "celular", 30, 2000000);
        
        System.out.println("****Stock inicial****");
        p1.mostrarEsatodo();
        p2.mostrarEsatodo();
        
        System.out.println("****Ventas****");
        p1.actualizarStock(-5);
        p2.actualizarStock(-15);
        
        System.out.println("****Surtido Nuevo****");
        p1.actualizarStock(11);
        p2.actualizarStock(20);
        
        System.out.println("****Estado del inventario****");
        p1.mostrarEsatodo();
        p2.mostrarEsatodo();
    }
}