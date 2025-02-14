/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas.vibrantes;

/**
 *
 * @author Usuario
 */
public class Ticket {
    
            private int id;
            private Cliente cliente;
            private Concierto concierto;
            private Zona zona;
            private double precioFinal;
            private String fechaCompra;

            public Ticket(int id, Cliente cliente, Concierto concierto, Zona zona, String fechaCompra) {
                this.id = id;
                this.cliente = cliente;
                this.concierto = concierto;
                this.zona = zona;
                this.fechaCompra = fechaCompra;
                this.precioFinal = calcularPrecioFinal();
            }

            public double calcularPrecioFinal() {
                return concierto.getPrecioBase() + zona.getPrecioAdicional();
            }

            // Getters
            public int getId() { return id; }
            public Cliente getCliente() { return cliente; }
            public Concierto getConcierto() { return concierto; }
            public Zona getZona() { return zona; }
            public double getPrecioFinal() { return precioFinal; }
            public String getFechaCompra() { return fechaCompra; }
        
}
