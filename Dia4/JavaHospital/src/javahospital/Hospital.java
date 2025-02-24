package javahospital;

import javahospital.Paciente;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    // Atributos
    private final String nombre;
    private final List<Paciente> pacientes;

    // Constructor
    public Hospital(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>(); // Inicializa la lista de pacientes
    }

    // Método para registrar un paciente
    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    void agregarDepartamento(Departamento emergencias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarDepartamento(Departamento emergencias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarDepartamento(Departamento pediatria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarDepartamento(Departamento emergencias) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getDepartamentos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}