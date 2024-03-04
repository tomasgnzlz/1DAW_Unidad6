/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifo;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Pila {

    ArrayList<String> pila;

    private static int MAXIMO_ELEMENTOS = 5;

    public Pila() {
        this.pila = new ArrayList<>(MAXIMO_ELEMENTOS);
    }

    // toString
    @Override
    public String toString() {
        return "Pila{ " + "pila=" + pila + " }";
    }

    // Método para saber si la pila esta llena
    public boolean pilaLlena() {
        boolean estado = false;
        if (numElementosLista() == MAXIMO_ELEMENTOS) {
            // la pila esta llena
            estado = true;
        }

        return estado;
    }

    // Método para añadir elementos al final de la lista
    public void push(String aux) {

        if (!pilaLlena()) {
            this.pila.add(0, aux);
        }

    }

    // Método para sacar elementos
    public String pop() {
        return this.pila.remove(0);
    }

    // Método para saber los elementos que hay en la lista
    public int numElementosLista() {
        return this.pila.size();
    }

}
