package javahospital;


import javahospital.Hospital;
import javahospital.Paciente;

public class Main {
    public static void main(String[] args) {
        // Crear un hospital
        Hospital hospital = new Hospital("Hospital General");

        // Crear departamentos
        Departamento emergencias = new Departamento("Emergencias");
        Departamento pediatria = new Departamento("Pediatría");

        // Agregar departamentos al hospital
        hospital.agregarDepartamento(emergencias);
        hospital.agregarDepartamento(pediatria);

        // Crear personal
        Doctor doctorLider = new Doctor("Dr. Juan Pérez", "Calle 123", "2020-01-01", 5000, true);
        Doctor doctorJunior = new Doctor("Dr. Ana López", "Calle 456", "2021-05-01", 4000, false);
        Enfermera enfermera = new Enfermera("Enf. María Gómez", "Calle 789", "2019-03-01", 3000);

        // Agregar personal a los departamentos
        emergencias.agregarPersonal(doctorLider);
        emergencias.agregarPersonal(enfermera);
        pediatria.agregarPersonal(doctorJunior);

        // Crear pacientes
        Paciente paciente1 = new Paciente("Carlos Ramírez", "Calle ABC", "1980-06-15", "Fiebre");
        paciente1.asignarPabellon("Pabellón Norte");

        // Registrar pacientes en el hospital
        hospital.registrarPaciente(paciente1);

        // Mostrar información
        System.out.println("Hospital: " + hospital.getNombre());
        System.out.println("Departamentos: " + hospital.getDepartamentos().size());
        System.out.println("Pacientes registrados: " + hospital.getPacientes().size());
    }
}