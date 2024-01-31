package Proyecto.Clases;

import Clases.*;

public class Persona {
    private String nombre;
    private String apellido;
    private String nacimiento;
    
    public Persona(){
        this.nombre = "Sin identificar";
        this.apellido = "Sin idetificar";
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    @Override
    public String toString(){
        return "Autor \nNombre: " + this.nombre +" "+ this.apellido;
    }
}
