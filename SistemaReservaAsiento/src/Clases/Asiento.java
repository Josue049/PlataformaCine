package Clases;

public class Asiento {

    private final int fila;
    private final int columna;
    private final char letra;

    public Asiento(int fila, int columna,char letra) {
        this.fila = fila;
        this.columna = columna;
        this.letra = letra;
    }
    
    @Override
    public String toString() {
        // +1 porque las filas inician en 0
        return String.format("Asiento %d%d%c", this.fila + 1,this.columna+1 ,letra);
    }
    
    

    
}
