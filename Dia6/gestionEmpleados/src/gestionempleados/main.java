package gestionempleados;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoFijo("Juan Garcia", 3000000));
        empleados.add(new EmpleadoPorHoras("María Jimenez", 2000000, 180));
        empleados.add(new EmpleadoPorHoras("Carlos Jaimes", 2000000, 150));

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Bonificación: $" + empleado.calcularBonificacion());
            System.out.println();
        }
    }
    
}
