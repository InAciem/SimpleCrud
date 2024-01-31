package Proyecto.Clases;

import Clases.*;

public class Libro {
    private String titulo;
    private String apartado;
    private int paginas;
    private Persona autor;
    private int precio;
    
    public Libro(){
        this.titulo = "Sin identificar";
    }
    
    public Libro(String titulo, String apartado, int paginas, Persona autor, int precio){
        this.titulo = titulo;
        this.apartado = apartado;
        this.paginas = paginas;
        this.autor = autor;
        this.precio = precio;
    }

    public String getApartado() {
        return apartado;
    }

    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }
    @Override
    public String toString(){
        return "Libro \nTitulo: " + this.getTitulo()
                + "\nGénero: " + this.getApartado()
                + "\nPaginas: " + this.getPaginas()
                + "\n" + this.autor
                + "\nPrecio: " + this.getPrecio();
    }
}
