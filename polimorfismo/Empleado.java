//se va a abstraer de crear objetos que no pueden ser instanciados directamente SOLO instanciada desde las subclases//
public abstract class Empleado {
    //protected solo accesibles dentro de la mimsa clase, subclase, y del  mismo paquete//
    protected String idEmpleado;
    protected String nombre;
    protected double sueldoBase;

    //constructor
    public Empleado(String idEmpleado,String nombre,double sueldoBase){
        //Atributo = argumento o variable recibido//
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;

    }
    //metodo abstracto, solo se define la ewstructura y el contenido va a ser implementado desde las subclases//
    public abstract double calcularSalario();

    //metodo de tipo final = que no va a cambiar = fijo

    public final void mostrarInfo(){
        System.out.println("id empleado "+ idEmpleado);
        System.out.println("nombre empleado "+ nombre);
        System.out.println("sueldo del empleado"+ sueldoBase);
    }

}