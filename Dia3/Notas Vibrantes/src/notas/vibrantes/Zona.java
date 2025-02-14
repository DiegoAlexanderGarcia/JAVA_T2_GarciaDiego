/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas.vibrantes;

/**
 *
 * @author Usuario
 */
public class Zona {
    
            private int id;
            private String nombreZona;
            private int capacidad;
            private double precioAdicional;

            public Zona(int id, String nombreZona, int capacidad, double precioAdicional) {
                this.id = id;
                this.nombreZona = nombreZona;
                this.capacidad = capacidad;
                this.precioAdicional = precioAdicional;
            }

            // Getters y setters
            public int getId() { return id; }
            public String getNombreZona() { return nombreZona; }
            public int getCapacidad() { return capacidad; }
            public double getPrecioAdicional() { return precioAdicional; }
        
}
