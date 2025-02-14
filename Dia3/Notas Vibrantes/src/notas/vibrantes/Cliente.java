/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas.vibrantes;

/**
 *
 * @author Usuario
 */
public class Cliente {

            private int id;
            private String nombre;
            private String apellido;
            private String correo;
            private String telefono;

            public Cliente(int id, String nombre, String apellido, String correo, String telefono) {
                this.id = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.correo = correo;
                this.telefono = telefono;
            }

            // Getters y setters
            public int getId() { return id; }
            public String getNombre() { return nombre; }
            public String getApellido() { return apellido; }
            public String getCorreo() { return correo; }
            public String getTelefono() { return telefono; }
        
}
