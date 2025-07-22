package Clases;

public class Pago {
    private double monto;
    private String numeroTarjeta;
    private String fecha;
    private String cvv;
    private String metodoPago;

    public Pago(){      
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
      
    public double getMonto() {
        return monto;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
    
    
}
