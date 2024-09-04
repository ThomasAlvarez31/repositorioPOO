
package tareapoo;

public class biblioteca {
    private libro Libro;
    public void mostrarLibro(){
        if (Libro !=null){
            Libro.mostrarInformacion();
        }else{
            System.out.println("No hay libros en la biblioteca");
        }
    }
    public void agregarLibro(String titulo, String autor){
        Libro= new libro (titulo,autor);
    }
    public void mostrarPalabraEnTitulo(String palabra){
        if(Libro !=null && Libro.getTitulo().contains(palabra)){
            System.out.println("El titulo del libro si contiene 1a palabra "+palabra);
        }else{
            System.out.println("El titulo no contiene la pabra "+palabra);
        }
    }
}
