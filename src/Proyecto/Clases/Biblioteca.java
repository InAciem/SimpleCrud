
package Proyecto.Clases;

import Clases.*;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private String nombre;
    
    public Biblioteca(String nombre){
        this.nombre = nombre;
    }
    
    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }
    
    public void eliminarLibro(String titulo){
        if (this.libros.contains(titulo)) {
            this.libros.remove(titulo);
            System.out.println("El libro ha sido elimiando correctamente...");
        }else{
            System.out.println("No se ha encontrado el libro.");
        }
    }
    public void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
