package CadenasDeTexto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FinalProject {

    public void eventPlanner() {

            HashMap<String, ArrayList<String>> eventosPorFecha = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Agregar evento");
                System.out.println("2. Mostrar eventos por fecha");
                System.out.println("3. Salir");
                System.out.print("Ingrese la opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                switch (opcion) {
                    case 1:
                        agregarEvento(eventosPorFecha, scanner);
                        break;
                    case 2:
                        mostrarEventosPorFecha(eventosPorFecha);
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        }

        public static void agregarEvento(HashMap<String, ArrayList<String>> eventosPorFecha, Scanner scanner) {
            System.out.println("Ingrese la fecha del evento (dd/mm/yyyy):");
            String fecha = scanner.nextLine();

            System.out.println("Ingrese el nombre del evento:");
            String evento = scanner.nextLine();

            ArrayList<String> eventos = eventosPorFecha.getOrDefault(fecha, new ArrayList<>());
            eventos.add(evento);
            eventosPorFecha.put(fecha, eventos);

            System.out.println("Evento agregado exitosamente.");
        }

        public static void mostrarEventosPorFecha(HashMap<String, ArrayList<String>> eventosPorFecha) {
            System.out.println("Eventos por fecha:");
            for (String fecha : eventosPorFecha.keySet()) {
                System.out.println("Fecha: " + fecha);
                ArrayList<String> eventos = eventosPorFecha.get(fecha);
                for (String evento : eventos) {
                    System.out.println(" - " + evento);
                }
            }
        }
    }


