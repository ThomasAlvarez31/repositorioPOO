public class EmpleadoPorHora extends Empleado implements BonusCalculable {
    private int horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHora(String idEmpleado, String nombre, int horasTrabajadas, double pagoPorHora){
        super(idEmpleado, nombre, horasTrabajadas*pagoPorHora);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;

    }
    @Override
    public double calcularSalario(){
        return horasTrabajadas * pagoPorHora + calcularBonus();
    }
    //metodo de la interface de bonuscalculado
    @Override
    public double calcularBonus(){
        return horasTrabajadas > 40 ? pagoPorHora * 0.5 : 0;
    }
}
