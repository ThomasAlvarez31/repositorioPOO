import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
    // Atributos
    private ArrayList<Alumno> listaAlumnos;
    private Scanner scanner;

    // Constructor
    public Gimnasio() {
        this.listaAlumnos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Método agregarAlumno
    public void agregarAlumno() {
        System.out.print("Ingrese el ID del alumno: ");
        int id = scanner.nextInt();
        while (id <= 0) {
            System.out.println("Error: El ID debe ser un número positivo.");
            System.out.print("Ingrese el ID del alumno nuevamente: ");
            id = scanner.nextInt();
        }

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.next();

        System.out.print("Ingrese la edad del alumno: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el tipo de membresía del alumno (true/false): ");
        boolean membresia = scanner.nextBoolean();

        Alumno alumno = new Alumno(id, nombre, edad, membresia);
        listaAlumnos.add(alumno);
    }

    // Método mostrarAlumnos
    public void mostrarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
        } else {
            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno.toString());
            }
        }
    }

    // Método actualizarAlumno
    public void actualizarAlumno() {
        System.out.print("Ingrese el ID del alumno que desea actualizar: ");
        int id = scanner.nextInt();

        Alumno alumno = buscarAlumno(id);
        if (alumno != null) {
            System.out.print("Ingrese el nuevo nombre del alumno: ");
            String nombre = scanner.next();
            alumno.setNombre(nombre);

            System.out.print("Ingrese la nueva edad del alumno: ");
            int edad = scanner.nextInt();
            alumno.setEdad(edad);

            System.out.print("Ingrese el nuevo tipo de membresía del alumno (true/false): ");
            boolean membresia = scanner.nextBoolean();
            alumno.setMembresia(membresia);
        } else {
            System.out.println("Error: No se encontró el alumno con el ID ingresado.");
        }
    }

    // Método eliminarAlumno
    public void eliminarAlumno() {
        System.out.print("Ingrese el ID del alumno que desea eliminar: ");
        int id = scanner.nextInt();

        Alumno alumno = buscarAlumno(id);
        if (alumno != null) {
            listaAlumnos.remove(alumno);
        } else {
            System.out.println("Error: No se encontró el alumno con el ID ingresado.");
        }
    }

    // Método buscarAlumno
    private Alumno buscarAlumno(int id) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId() == id) {
                return alumno;
            }
        }
        return null;
    }
}
