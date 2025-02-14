/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas.vibrantes;

/**
 *
 * @author Usuario
 */
public class Concierto {
    
            private int id;
            private String nombre;
            private String artista;
            private String fecha;
            private String lugar;
            private double precioBase;

            public Concierto(int id, String nombre, String artista, String fecha, String lugar, double precioBase) {
                this.id = id;
                this.nombre = nombre;
                this.artista = artista;
                this.fecha = fecha;
                this.lugar = lugar;
                this.precioBase = precioBase;
            }

            // Getters y setters
            public int getId() { return id; }
            public String getNombre() { return nombre; }
            public String getArtista() { return artista; }
            public String getFecha() { return fecha; }
            public String getLugar() { return lugar; }
            public double getPrecioBase() { return precioBase; }
        
}
