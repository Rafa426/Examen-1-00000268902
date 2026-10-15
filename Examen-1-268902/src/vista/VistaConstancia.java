package vista;

import controlador.ControladorConstancia;
import modelo.Alumno;

import java.util.List;
import java.util.Scanner;

public class VistaConstancia {
    private ControladorConstancia controlador;
    private Scanner teclado = new Scanner(System.in);
    private List<Alumno> alumnos;

    public void setControlador(ControladorConstancia c) {
        this.controlador = c;
    }

    public void iniciar() {
        System.out.println("=== GENERAR CONSTANCIA DE ALUMNO INSCRITO ===");
        while (true) {
            System.out.print("\nIngrese el ID del alumno o parte del ID (salir para terminar): ");
            String texto = teclado.nextLine().trim();
            if (texto.equalsIgnoreCase("salir")) break;

            controlador.idTecleado(texto);
            if (alumnos.isEmpty()) {
                System.out.println("No se encontraron alumnos.");
                continue;
            }

            System.out.print("Seleccione el numero del alumno: ");
            int opcion = leerNumero();
            if (opcion < 1 || opcion > alumnos.size()) {
                System.out.println("Opcion invalida.");
                continue;
            }

            Alumno elegido = alumnos.get(opcion - 1);
            controlador.alumnoSeleccionado(elegido);

            System.out.print("\nGenerar constancia? (s/n): ");
            if (teclado.nextLine().trim().equalsIgnoreCase("s")) {
                controlador.generarConstancia(elegido);
            }
        }
        System.out.println("Fin del programa.");
    }

    private int leerNumero() {
        try {
            return Integer.parseInt(teclado.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
        if (!alumnos.isEmpty()) {
            System.out.println("\nAlumnos encontrados:");
            for (int i = 0; i < alumnos.size(); i++) {
                System.out.println((i + 1) + ". " + alumnos.get(i));
            }
        }
    }

    public void mostrarDatos(String texto) {
        System.out.println("\n" + texto);
    }

    public void mostrarConstancia(String texto) {
        System.out.println("\n" + texto);
    }
}
