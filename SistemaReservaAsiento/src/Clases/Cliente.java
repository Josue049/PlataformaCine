package Clases;


public class Cliente extends Persona{
    private String dni;
    private String correo;
    private String telefono;
    
    public Cliente(String nombre, String apellido, String genero, int edad) {
        super(nombre, apellido, genero, edad);
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
