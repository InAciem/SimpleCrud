package Clases;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double sueldo;
    
    public Empleado(){
        this.nombre = "No se identifica";
    }
    
    public Empleado(String nombre, String apellido, int edad, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
        
    }
    
    public double calcularSueldo(){
        return this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "Empleado \nNombre: " + this.nombre + " " + this.apellido
                + "\nEdad: " + this.edad + "\nSueldo: " + this.calcularSueldo();
    }
}
