package notas.vibrantes;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasVibrantes {


    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                ArrayList<Cliente> clientes = new ArrayList<>();
                ArrayList<Concierto> conciertos = new ArrayList<>();
                ArrayList<Zona> zonas = new ArrayList<>();
                ArrayList<Ticket> tickets = new ArrayList<>();

                // Datos
                clientes.add(new Cliente(1, "Juan", "Perez", "juan@example.com", "123456789"));
                conciertos.add(new Concierto(1, "Concierto Mexicano", "Banda Calibre 50", "2023-12-01", "Estadio", 50.0));
                zonas.add(new Zona(1, "VIP", 100, 20.0));
                zonas.add(new Zona(2, "General", 500, 10.0));

                while (true) {
                    System.out.println("=== MENÚ PRINCIPAL ===");
                    System.out.println("1. Ver conciertos disponibles.");
                    System.out.println("2. Registrar cliente.");
                    System.out.println("3. Comprar ticket.");
                    System.out.println("4. Ver tickets por cliente.");
                    System.out.println("5. Cancelar ticket.");
                    System.out.println("6. Salir.");
                    System.out.print("Seleccione una opción: ");
                    int opcion = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    switch (opcion) {
                        case 1 -> {
                            System.out.println("=== CONCIERTOS DISPONIBLES ===");
                            for (Concierto c : conciertos) {
                                System.out.println(c.getId() + ". " + c.getNombre() + " - " + c.getArtista() + " (" + c.getFecha() + ")");
                            }
                        }

                        case 2 -> {
                            System.out.print("Ingrese nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Ingrese apellido: ");
                            String apellido = scanner.nextLine();
                            System.out.print("Ingrese correo: ");
                            String correo = scanner.nextLine();
                            System.out.print("Ingrese teléfono: ");
                            String telefono = scanner.nextLine();
                            Cliente nuevoCliente = new Cliente(clientes.size() + 1, nombre, apellido, correo, telefono);
                            clientes.add(nuevoCliente);
                            System.out.println("Cliente registrado con éxito.");
                        }

                        case 3 -> {
                            
                        }

                        case 4 -> {
                            System.out.print("Ingrese el ID del cliente: ");
                            int idClienteTickets = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("=== TICKETS DEL CLIENTE ===");
                            for (Ticket t : tickets) {
                                if (t.getCliente().getId() == idClienteTickets) {
                                    System.out.println("Ticket ID: " + t.getId() + ", Concierto: " + t.getConcierto().getNombre() + ", Zona: " + t.getZona().getNombreZona());
                                }
                            }
                        }

                        case 5 -> {

                        }

                        case 6 -> {
                            System.out.println("Saliendo del sistema...");
                            scanner.close();
                            return;
                        }

                        default -> System.out.println("Opción inválida.");
                    }
                }
            }
        }

    

