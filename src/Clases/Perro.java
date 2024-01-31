package Clases;

import java.util.regex.Pattern;

public class Perro {

    private String nombre;
    private String raza;
    private String color;
    private String dimension;
    private int edad;
    private Humano propietario;

    public Perro() {
    }

    public Perro(String raza, String color, int edad, String dimension) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.dimension = dimension;
    }

    public Perro(String nombre, String raza, String color, int edad, String dimension) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.dimension = dimension;
    }
    public String getPerro(){
        return this.getNombre() + ", " + this.getRaza() + ", " + this.getColor() + ", " + this.getEdad() + ", "+ this.getDimension() +
                "\nDatos del propietario: " + this.propietario.getHumano();
    }

    public String getNombre() {
        if (this.nombre == null) {
            return "No tiene nombre";
        }
        return this.nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getColor() {
        return this.color;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        if (Pattern.compile("[0-9]").matcher(raza).find()) {
            System.out.println("Invalido");
        }
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("Invalido");
        }
        this.edad = edad;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    
    public void setPropietario(Humano propietario){
        this.propietario = propietario;
    }
}
