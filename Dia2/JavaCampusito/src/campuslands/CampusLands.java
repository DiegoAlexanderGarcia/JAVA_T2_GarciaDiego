package campuslands;

import java.util.ArrayList;
import java.util.Scanner;

public class CampusLands {
    // Clase principal para ejecutar el programa
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            // Menú principal
            do {
                System.out.println("=== MENÚ PRINCIPAL ===");
                System.out.println("1. Gestión de Campers");
                System.out.println("2. Gestión de Trainers");
                System.out.println("3. Gestión de Rutas");
                System.out.println("4. Generar Reportes");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                switch (opcion) {
                    case 1 -> menuCampers(scanner);
                    case 2 -> menuTrainers(scanner);
                    case 3 -> menuRutas(scanner);
                    case 4 -> generarReportes();
                    case 5 -> System.out.println("Saliendo del sistema...");
                    default -> System.out.println("Opción inválida. Intente de nuevo.");
                }
            } while (opcion != 5);
        }
    }

    // Menú para gestión de campers
    private static void menuCampers(Scanner scanner) {
        ArrayList<Camper> campers = new ArrayList<>();
        int opcion;

        // Datos 
        campers.add(new Camper(1, "Juan", "Perez", "Calle 123", "Maria", "3001234567", "Inscrito", "Bajo"));
        campers.add(new Camper(2, "Ana", "Gomez", "Carrera 45", "Carlos", "3019876543", "Aprobado", "Medio"));

        do {
            System.out.println("\n=== MENÚ CAMPERS ===");
            System.out.println("1. Registrar Camper");
            System.out.println("2. Listar Campers");
            System.out.println("3. Cambiar Estado de Camper");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> registrarCamper(scanner, campers);
                case 2 -> listarCampers(campers);
                case 3 -> cambiarEstadoCamper(scanner, campers);
                case 4 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    // Método para registrar un nuevo camper
    private static void registrarCamper(Scanner scanner, ArrayList<Camper> campers) {
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese Acudiente: ");
        String acudiente = scanner.nextLine();
        System.out.print("Ingrese Teléfono: ");
        String telefono = scanner.nextLine();

        campers.add(new Camper(id, nombres, apellidos, direccion, acudiente, telefono, "En proceso de ingreso", "Sin riesgo"));
        System.out.println("Camper registrado exitosamente.");
    }

    // Método para listar campers
    private static void listarCampers(ArrayList<Camper> campers) {
        if (campers.isEmpty()) {
            System.out.println("No hay campers registrados.");
        } else {
            System.out.println("\n=== LISTA DE CAMPERS ===");
            for (Camper camper : campers) {
                System.out.println(camper);
            }
        }
    }

    // Método para cambiar el estado de un camper
    private static void cambiarEstadoCamper(Scanner scanner, ArrayList<Camper> campers) {
        System.out.print("Ingrese el ID del camper a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Camper camper : campers) {
            if (camper.getId() == id) {
                System.out.print("Ingrese el nuevo estado (Inscrito/Aprobado/Cursando/Graduado): ");
                String nuevoEstado = scanner.nextLine();
                camper.setEstado(nuevoEstado);
                System.out.println("Estado actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Camper no encontrado.");
    }

    // Menú para gestión de trainers
    private static void menuTrainers(Scanner scanner) {
        ArrayList<Trainer> trainers = new ArrayList<>();

        // Datos falsos iniciales
        trainers.add(new Trainer(1, "Pedro Gomez", "Java"));
        trainers.add(new Trainer(2, "Laura Martinez", "NodeJS"));

        int opcion;

        do {
            System.out.println("\n=== MENÚ TRAINERS ===");
            System.out.println("1. Registrar Trainer");
            System.out.println("2. Listar Trainers");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> registrarTrainer(scanner, trainers);
                case 2 -> listarTrainers(trainers);
                case 3 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    // Método para registrar un nuevo trainer
    private static void registrarTrainer(Scanner scanner, ArrayList<Trainer> trainers) {
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese Especialidad: ");
        String especialidad = scanner.nextLine();

        trainers.add(new Trainer(id, nombre, especialidad));
        System.out.println("Trainer registrado exitosamente.");
    }

    // Método para listar trainers
    private static void listarTrainers(ArrayList<Trainer> trainers) {
        if (trainers.isEmpty()) {
            System.out.println("No hay trainers registrados.");
        } else {
            System.out.println("\n=== LISTA DE TRAINERS ===");
            for (Trainer trainer : trainers) {
                System.out.println(trainer);
            }
        }
    }

    // Menú para gestión de rutas
    private static void menuRutas(Scanner scanner) {
        ArrayList<Ruta> rutas = new ArrayList<>();

        // Datos falsos iniciales
        rutas.add(new Ruta(1, "Ruta Java", 33));
        rutas.add(new Ruta(2, "Ruta NodeJS", 33));

        int opcion;

        do {
            System.out.println("\n=== MENÚ RUTAS ===");
            System.out.println("1. Crear Ruta");
            System.out.println("2. Listar Rutas");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> crearRuta(scanner, rutas);
                case 2 -> listarRutas(rutas);
                case 3 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    // Método para crear una nueva ruta
    private static void crearRuta(Scanner scanner, ArrayList<Ruta> rutas) {
        System.out.print("Ingrese ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese Nombre de la Ruta: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese Capacidad Máxima: ");
        int capacidad = scanner.nextInt();

        rutas.add(new Ruta(id, nombre, capacidad));
        System.out.println("Ruta creada exitosamente.");
    }

    // Método para listar rutas
    private static void listarRutas(ArrayList<Ruta> rutas) {
        if (rutas.isEmpty()) {
            System.out.println("No hay rutas registradas.");
        } else {
            System.out.println("\n=== LISTA DE RUTAS ===");
            for (Ruta ruta : rutas) {
                System.out.println(ruta);
            }
        }
    }

    // Método para generar reportes
    private static void generarReportes() {
        System.out.println("\n=== GENERAR REPORTES ===");
        System.out.println("Funcionalidad de reportes aún no implementada.");
    }
}

