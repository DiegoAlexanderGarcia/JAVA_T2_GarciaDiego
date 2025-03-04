
package dia8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class main{
    /*conjuntos, mapas enumeraciones y excepciones
    SETS:
    los sets son una coleccion desordenada de objetos en la que no se pueden
    almacenar valores duplicados.
    
    */
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        // Arreglos elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        treeSet.add("pera");
        //mostrar los elementos del TreeSet
        System.out.println("Elementos en TreeSet: " + treeSet);
        //Iteracion en un arbol
        //1. Importar "Iterator" y navegar con ese iterador
        
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("$$$$$$$$$$$$$$$$$$$");
        //2. con un for-each
        for(String elemento:treeSet){
            System.out.println(elemento);
        }
        
        //Obtener el tamaño del conjunto
        int tamano =treeSet.size();//Esto almacena el umero de elementos del conjunto en la variable tamaño
        System.out.println(tamano);
        
        //Convertir el set en un string
        String resultado = treeSet.toString();//esto almacena una reprecentacion en cadena del conjunto en la variable resultado
        System.out.println(resultado);
        
        /*MAPAS
        los mapas son una estructura de datos que me permite guardar en manera de 
        asociacion de clave/valor, muy parecido a los diccionarios
        */
        
        Map<String, Integer> hashMap = new HashMap<>();
        
        //asignar valores al mapa usando el metodo put()
        hashMap.put("Juan", 25);
        hashMap.put("Maria", 30);
        hashMap.put("Luis",28);
        hashMap.put("Ana",35);
        
        //acceder y mostrar los valores del HashMap
        System.out.println("Edad de Jaun: " + hashMap.get("Jaun"));
        System.out.println("Edad de Maria: " + hashMap.get("Maria"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
        
        /*
        Iterar entre un mapa
        1. importando iterador 
        */
        Iterator<Map.Entry<String, Integer>>iterator2 = hashMap.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, Integer> entry = iterator2.next();
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre: " + clave + "Edad: " + valor);
        }
        
        System.out.println("######################");
        //2. bucle for- each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
        String clave = entry.getKey();
        Integer valor = entry.getValue();
        System.out.println("Nombre: " + clave + "Edad: " + valor);
        }
        
        
        System.out.println("$$$$$$$$$$$$$$$$$$$");
        Pais francia = Pais.FRANCIA;
        String nombre = francia.name();
        System.out.println(francia.toString());
        System.out.println(francia.ordinal());
        System.out.println(francia.values());
        
        Pais miPais = Pais.ESPANA;
        
        String nombrePais = miPais.getNombre();
        String capitalPais = miPais.getCapital();
        
        System.out.println("Pais: " + nombrePais);
        System.out.println("Capital: " + capitalPais);
        

    }   
    
}
