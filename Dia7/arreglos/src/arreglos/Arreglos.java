package arreglos;

import java.util.ArrayList;

public class Arreglos {
        //esrructura de datos:
        //una estructura de datos es una forma organizar de almacenar, gestionar
        //y manipular datos para que pueda ser utilizado de manera eficiente
    public static void main(String[] args) {
            //arreglo: 
            //un arreglo es una estructura de datos que posibilita la agrupacion de
            // ementos del mismo tipo en una sola variable
            int [] arreglito;
            //un arreglo se debe inicializar para que tenga un espacio de memoria
            int [] arreglito2 = new int[5];
            arreglito2[0]=8;
            System.out.println(arreglito2[3]);
            System.out.println(arreglito2.length);
            
            for(int i=0;i<arreglito2.length;i++){
                System.out.println(arreglito2[i]);
            }
            
            System.out.println("######################");
            
            //Matrices:
            //las matrices son arreglos multidimencionales, donde en jaba se 
            //crea comunmente las de dos dimenciones
            int cantFila = 3;
            int cantCol = 2;
            int [] [] matriz = new int [cantFila] [cantCol];
            matriz [0][0] = 1;
            matriz [0][1] = 2;
            matriz [1][0] = 3;
            matriz [1][1] = 4;
            matriz [2][0] = 5;
            matriz [2][1] = 6;
            
            //Ciclo anidado
         for (int i = 0; i < cantFila; i++) {
                   for(int q=0;q<cantCol;q++){
                                    System.out.println(matriz[i][q]);
                           }
                  }
         
         ArrayList<String> nombreArrayList = new ArrayList<String>();
         
         // Añade el elemento al ArrayList
nombreArrayList.add("Elemento");

// Añade el elemento al ArrayList en la posición 'n'
nombreArrayList.add(1, "Elemento 2");

// Devuelve el número de elementos del ArrayList
nombreArrayList.size();

// Devuelve el elemento que está en la posición '2' del ArrayList
nombreArrayList.get(1);

// Comprueba si existe el elemento ('Elemento') que se le pasa como parámetro
nombreArrayList.contains("Elemento");

// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList
nombreArrayList.indexOf("Elemento");

// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
nombreArrayList.lastIndexOf("Elemento");

// Borra el elemento de la posición '5' del ArrayList
nombreArrayList.remove(1);

// Borra la primera ocurrencia del 'Elemento' que se le pasa como parámetro.
nombreArrayList.remove("Elemento");

// Borra todos los elementos de ArrayList
nombreArrayList.clear();

// Devuelve True si el ArrayList está vacío. Sino devuelve False
nombreArrayList.isEmpty();
         
         }
}
