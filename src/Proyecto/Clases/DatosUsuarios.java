package Proyecto.Clases;

import java.util.ArrayList;
import java.util.List;

public class DatosUsuarios {
    private static final DatosUsuarios instancia = new DatosUsuarios();
    private List<Usuario> usuarios = new ArrayList<>();

    public DatosUsuarios() {
        
    }
    
    public DatosUsuarios getInstancia(){
        return this.instancia;
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public boolean buscarUsuario(Usuario usuario) {
        for (Usuario usuario1 : usuarios) {
            if (usuario1 == usuario) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarUsuario(String usuario, String clave) {
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getUsuario().contentEquals(usuario) && usuario1.getClave().contentEquals(clave)) {
                return true;
            }
        }
        return false;
    }

    public void imprimirUsuariosDebugger() {
        try {
            if (usuarios != null) {
                if (!usuarios.isEmpty()) {
                    for (Usuario usuario : this.usuarios) {
                        System.out.println(usuario);
                    }
                } else{
                    System.err.println("La lista esá vacía.");
                }
            } else  {
                System.err.println("La lista es nula.");
            }

        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }
    public void reemplazarUsuarioPorNombreDeUsuario(Usuario usuario, String usuarioNombre){
        for (Usuario usuario1 : usuarios) {
            if (usuario1.getUsuario().contentEquals(usuarioNombre)) {
                usuario.setUsuario(usuarioNombre);
                usuario.setClave(usuarioNombre);
                usuario.setRol(usuario1.getRol());
            }
        }
    }
}
