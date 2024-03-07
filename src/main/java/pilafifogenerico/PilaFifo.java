/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilafifogenerico;

import java.util.ArrayList;

/**
 *
 * @author tomas
 * @param <T>
 */
public class PilaFifo<T> {

    ArrayList<T> pila;
    private static int maxElementos;

    public PilaFifo(int maxElementos) {
        this.pila = new ArrayList<>(maxElementos);
        this.maxElementos = maxElementos;
    }

    // toString
    @Override
    public String toString() {
        return "Pila{ " + "pila=" + pila + " }";
    }

    // Método para añadir elementos al final de la lista
    public void push(T aux) {

        if (!pilaLlena()) {
            this.pila.add(aux);
        }

    }

    // Método para sacar elementos
    public T pop() {
        return this.pila.remove(this.pila.size() - 1);
    }

    // Método para saber los elementos que hay en la lista
    public int numElementosLista() {
        return this.pila.size();
    }

    // Método para saber si la pila esta llena
    public boolean pilaLlena() {
        boolean estado = false;
        if (numElementosLista() == maxElementos) {
            estado = true;
        }

        return estado;
    }

    // Método para saber si la pila está vacia.
    public boolean pilaVacia() {
        return this.pila.isEmpty();
    }

}
