/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;

/**
 *
 * @author josue
 */

public class Pilas {
    private List<String> elementos;

    public Pilas() {
        elementos = new ArrayList<>();
    }

    // Agrega un nuevo elemento (alias de apilar)
    public void agregarNuevo(String valor) {
        apilar(valor);
    }

    // Apilar (push)
    public void apilar(String elemento) {
        elementos.add(elemento);
    }

    // Desapilar (pop)
    public String desapilar() {
        if (estaVacia()) {
            System.out.println("Error: Pila vacía.");
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    // Cima (peek) → Último valor
    public String cima() {
        return obtenerUltimoValor();
    }

    // Obtener el primer valor agregado (base de la pila)
    public String obtenerPrimerValor() {
        if (estaVacia()) {
            System.out.println("Error: Pila vacía.");
            return null;
        }
        return elementos.get(0); // Base de la pila
    }

    // Obtener el último valor agregado (cima de la pila)
    public String obtenerUltimoValor() {
        if (estaVacia()) {
            System.out.println("Error: Pila vacía.");
            return null;
        }
        return elementos.get(elementos.size() - 1); // Cima
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // Mostrar pila
    public void mostrarPila() {
        for (int i = elementos.size() - 1; i >= 0; i--) {
            System.out.println("| " + elementos.get(i) + " |");
        }
        System.out.println(" ----- ");
    }
    
    public void mostrarPilaEnTextArea(JTextArea jTextArea1) {
    StringBuilder contenido = new StringBuilder();
    contenido.append("Contenido de la pila:\n");
    for (int i = elementos.size() - 1; i >= 0; i--) {
        contenido.append("| ").append(elementos.get(i)).append(" |\n");
    }
    contenido.append(" ----- ");
    jTextArea1.setText(contenido.toString());
}
}
