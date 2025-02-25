package javadia5;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String getNombre() {
        return nombre;
    }    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0){
            this.cantidad = cantidad;
        }else {
            System.err.println("La cantidad no debe de ser negativa");
        }
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio debe ser mayor a 0.");
        }
    }
    
    public void actualizarStock(int cantidad){
        int nuevoStock = this.cantidad = cantidad;
        if (cantidad > 0){
            this.cantidad = nuevoStock;
            System.out.println("Stock actualizado, nuevo stock: " + this.cantidad);
        }else {
            System.out.println("No se puede actualizar el stock por debajo de 0.");
        }
    }
    
    public void mostrarEsatodo(){
        System.out.println("Codigo: " + codigo + "\nNombre: " + nombre + "\nCantidad: " + cantidad + "\nPrecio: " + precio);
    }
}
