
package dia8;

public enum Pais {
        
    
    /*Enumerador
    un enumerador es una clase que restringe la creacion de objetos a los valores espesificamente
    definidos en su implementacion.
    */

    
    ESPANA("España", "Madrid"),
    FRANCIA("Francia","Paris"),
    ITALIA("Italia","Roma"),
    ALEMANIA("Alemania","Berlin"),
    REINO_UNIDO("Reino Unido","Londres");
    
    private String nombre;
    private String capital;
    
    private Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }
     public String getNombre(){
         return nombre;
     }
     
     public String getCapital(){
         return capital;
     }
}   
