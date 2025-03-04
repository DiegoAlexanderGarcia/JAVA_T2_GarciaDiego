package dia9;


public class main {
    
    static void verificarEdad(int edad){
        if (edad < 18){
            throw new ArithmeticException("Acceso es denegado - Debes ser mayoría de edad.");
        }else{
            System.out.println("Acceso autorizado!!!");
        }
    }
    
    public static boolean usarEdad(int edad){
        try{
        verificarEdad(edad);
        return true;
        }
        catch(Exception e){
            System.out.println("El programa tuvo un error: "+e.getMessage());
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(usarEdad(66));
        
    }
}
