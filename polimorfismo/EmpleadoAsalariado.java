public class EmpleadoAsalariado extends Empleado implements BonusCalculable{
    //No tiene atributos
    
    //constructor
    public EmpleadoAsalariado(String idEmpleado,String nombre,double sueldoBase){
        super(idEmpleado, nombre, sueldoBase);
    }

    public double calcularSalario(){
        return sueldoBase + calcularBonus();
    }

    //metodo abstracto de la intefaz
    public double calcularBonus(){
        return sueldoBase * 0.1;
    }
}
