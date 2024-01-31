package Proyecto.Clases;

public class Usuario {
    private String usuario;
    private String clave;
    private rol rol;
    
    enum rol{
        USUARIO,
        ADMIN
    }
    
        public Usuario() {

    }
    
    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol.USUARIO;
    }

    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }

    public void convertirAdmin(){
        this.setRol(rol.ADMIN);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return this.usuario + "\n" + this.clave
                + "\nRol: " + this.rol
                + "\n------";
    }
}
