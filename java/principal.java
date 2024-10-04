import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Gimnasio gimnasio = new Gimnasio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Actualizar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gimnasio.agregarAlumno();
                    break;
                case 2:
                    gimnasio.mostrarAlumnos();
                    break;
                case 3:
                    gimnasio.actualizarAlumno();
                    break;
                case 4:
                    gimnasio.eliminarAlumno();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}