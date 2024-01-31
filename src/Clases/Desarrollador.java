package Clases;

public class Desarrollador extends Empleado {

    private int horaExtra;

    public Desarrollador(String nombre, String apellido, int edad, double sueldo, int horasExtra) {
        super(nombre, apellido, edad, sueldo);
        this.horaExtra = horasExtra;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (this.horaExtra * 6000);
    }

}
