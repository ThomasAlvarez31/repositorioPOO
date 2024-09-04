
package tareapoo;
import java.util.Scanner;

public class TareaPOO {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        biblioteca Biblioteca = new biblioteca();
        
        int opcion;
        
        while(true){
            System.out.println("Ingrese la opcion del menu");
            System.out.println("1- agregar un libro a la biblioteca");
            System.out.println("2- mostrar un libro en biblioteca");
            System.out.println("3- buscar una palabra en el titutlo del libro");
            System.out.println("4- salir del programa");
            System.out.println("seleccione una opcion");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el titulo del libro");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    String autor = scanner.nextLine();
                    Biblioteca.agregarLibro(titulo, autor);
                    break;
                    
                case 2:
                    Biblioteca.mostrarLibro();
                    break;
                case 3:
                    System.out.println("Ingrese la palabra a buscar en titutlo del libro");
                    String palabra = scanner.nextLine();
                    Biblioteca.mostrarPalabraEnTitulo(palabra);
                    break;
                    
                case 4:
                    return;
                default:
                    System.out.println("Ingresa una opcion valida");
            }
        }
    }
    
}
