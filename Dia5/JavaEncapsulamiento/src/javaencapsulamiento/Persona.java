package javaencapsulamiento;
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        
        return "tu nombre es:" + nombre;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre +"Tibu";
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if (edad > 0){
            this.edad = edad;
        }else{
            System.out.println("la edad no es valida.");
        }
    }
    
    /*
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    */
    
}
