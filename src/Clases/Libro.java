
package Clases;

public class Libro {
    private String titulo;
    private int paginas;
    private Persona autor;
    
    public Libro(){
        this.titulo = "Sin identificar";
    }
    
    public Libro(String titulo, int paginas, Persona autor){
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
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
                + "\nPaginas: " + this.getPaginas()
                + "\n" + this.autor;
    }
}
