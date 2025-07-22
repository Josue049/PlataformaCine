package Clases;

public class Sala {
    private final String[] numeroSala = {"Sala 1", "Sala 2","Sala 3","Sala 4","Sala 5"};
    private final Asiento[][] asientos;
    private Asiento[] asientoSeleccionados;

    
    private String horario;
    private final char[] letra = {'A','B','C','D','E','F'};
    //private Asiento[] asientoSeleccionados;

    public Sala() {
        this.asientos = new Asiento[6][6];
        for (int i = 0; i < asientos.length; i++) {//Fila
            for(int j = 0; j < asientos.length; j++){//Columna
                this.asientos[i][j] = new Asiento(i,j,letra[i]);
            }
        }
    }
  
    public void AsientoSeleccionado(int fila, int col, int i){
        this.asientoSeleccionados[i] = this.asientos[fila][col];
    }
    
    public void tamañoVector(int cont){
        this.asientoSeleccionados = new Asiento[cont];
    }

    public Asiento[] getAsientoSeleccionados() {
        return asientoSeleccionados;
    }
    
    public String[] getNumeroSala() {
        return numeroSala;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}