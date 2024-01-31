package Clases;

public class Jefe extends Empleado {

    private double bono;

    public Jefe(String nombre, String apellido, int edad, double sueldo, double bono) {
        super(nombre, apellido, edad, sueldo);
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + this.bono;
    }

}
