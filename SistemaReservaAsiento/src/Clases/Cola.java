package Clases;

public class Cola {
    int[] clientes;
    int inicio, fin;
    int tamaño;
    int numeroCliente = 1;

    public Cola(int tamaño) {
        this.tamaño = tamaño;
        this.clientes = new int[tamaño];
        this.inicio = 0;
        this.fin = -1;
    }

    public boolean estaLlena() {
        return fin == tamaño - 1;
    }

    public boolean estaVacia() {
        return inicio > fin;
    }
    
    public void llenarCola() {
        reiniciarCola(); 

        for (int i = 0; i < tamaño && !estaLlena(); i++) {
            agregarCliente();
        }
    }

    public boolean agregarCliente() {
        if (estaLlena()) {
            return false;
        }

        fin++;
        clientes[fin] = numeroCliente++;
        return true;
    }

    public int eliminarCliente() {
        if (estaVacia()) {
            return -1;
        }

        int cliente = clientes[inicio];
        inicio++;
        return cliente;
    }

    public void reiniciarCola() {
        inicio = 0;
        fin = -1;
    }
}
