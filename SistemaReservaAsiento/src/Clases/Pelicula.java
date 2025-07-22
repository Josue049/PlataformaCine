
package Clases;

public class Pelicula {
    private final String[] titulos = {"Lilo y Stitch","Destino Final Lazos de Sangre","La chica de la aguja","Una Película de Minecraft","Karate Kid Leyendas"};
    private final String[] generos = {"Familiar","Terror","Drama","Animación","Accion"};
    private final int[] duraciones = {100,109,125,101,100};
    
    private String titulo;
    private String genero;
    private int duracion;

    public Pelicula() {}
    
    public void SeleccionarTituloPelicula(int indice){
        this.setTitulo(this.titulos[indice]);
    }
    
    public void SeleccionarGeneroPelicula(int indice){
        this.setGenero(this.generos[indice]);
    }
    
    public void SeleccionarDuracionPelicula(int indice){
        this.setDuracion(this.duraciones[indice]);
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
    
    
    

    
}
