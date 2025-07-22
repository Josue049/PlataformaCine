package Clases;

public class Admin {
    private final String usuario = "admin2025";
    private final String contraseña = "123456";
    private Pago pago;//Agregacion

    public Admin() {
        //super(dni, nombre, correo);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }


    
    
}
