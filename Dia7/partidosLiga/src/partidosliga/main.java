package partidosliga;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDePartidos gestor = new GestorDePartidos();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Partido");
            System.out.println("2. Finalizar Partido");
            System.out.println("3. Mostrar Ganador");
            System.out.println("4. Mostrar Información del Partido");
            System.out.println("5. Listar Partidos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarPartido(scanner, gestor);
                    break;
                case 2:
                    finalizarPartido(scanner, gestor);
                    break;
                case 3:
                    mostrarGanador(scanner, gestor);
                    break;
                case 4:
                    mostrarInformacion(scanner, gestor);
                    break;
                case 5:
                    gestor.listarPartidos();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static void registrarPartido(Scanner scanner, GestorDePartidos gestor) {
        System.out.print("Tipo de partido (1: Liga, 2: PlayOffs): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Equipo Local: ");
        String equipoLocal = scanner.nextLine();
        System.out.print("Equipo Visitante: ");
        String equipoVisitante = scanner.nextLine();
        System.out.print("Fecha (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());

        if (tipo == 1) {
            System.out.print("Número de Jornada: ");
            int jornada = scanner.nextInt();
            Partido partido = new PartidoLiga(equipoLocal, equipoVisitante, fecha, jornada);
            gestor.registrarPartido(partido);
        } else if (tipo == 2) {
            System.out.print("Ronda (octavos, cuartos, final): ");
            String ronda = scanner.nextLine();
            Partido partido = new PartidoPlayOff(equipoLocal, equipoVisitante, fecha, ronda);
            gestor.registrarPartido(partido);
        } else {
            System.out.println("Tipo de partido inválido.");
        }
    }

    private static void finalizarPartido(Scanner scanner, GestorDePartidos gestor) {
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        gestor.finalizarPartido(indice - 1); // Restamos 1 para ajustar al índice del arreglo
    }

    private static void mostrarGanador(Scanner scanner, GestorDePartidos gestor) {
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        gestor.mostrarGanador(indice - 1); // Restamos 1 para ajustar al índice del arreglo
    }

    private static void mostrarInformacion(Scanner scanner, GestorDePartidos gestor) {
        System.out.print("Índice del partido: ");
        int indice = scanner.nextInt();
        gestor.mostrarInformacion(indice - 1); // Restamos 1 para ajustar al índice del arreglo
    }
}