package Clases;

public class GestionUsuario {
    private NodoUsuario cabeza;

    // Registrar nuevo usuario
    public void registrarUsuario(Usuario nuevo) {
        NodoUsuario nodoNuevo = new NodoUsuario(nuevo);

        if (cabeza == null) {
            cabeza = nodoNuevo;
        } else {
            NodoUsuario actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nodoNuevo;
        }
    }

    // Iniciar sesión
    public Usuario iniciarSesion(String nombreUsuario, String contrasena) {
        NodoUsuario actual = cabeza;
        while (actual != null) {
            if (actual.usuario.coincide(nombreUsuario, contrasena)) {
                return actual.usuario;
            }
            actual = actual.siguiente;
        }
        return null; // usuario no encontrado
    }

    // Listar usuarios
    public void listarUsuarios() {
        NodoUsuario actual = cabeza;
        while (actual != null) {
            System.out.println(actual.usuario);
            actual = actual.siguiente;
        }
    }

}
