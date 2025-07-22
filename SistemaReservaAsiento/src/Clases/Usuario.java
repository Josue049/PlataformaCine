package Clases;

public class Usuario {
    private String nombre;
    private String apellido;
    private String contrasena;

    public Usuario(String nombre, String apellido, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean coincide(String usuario, String contrasena) {
        return this.apellido.equals(usuario) && this.contrasena.equals(contrasena);
    }

    @Override
    public String toString() {
        return nombre + " (" + apellido + ")";
    }
}
