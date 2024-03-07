/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilalifogenerico;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class PilaLifo<T> {
     private ArrayList<T> pila;
    private int MAXIMO_ELEMENTOS;

    public PilaLifo(int MAXIMO_ELEMENTOS) {
        this.pila = new ArrayList<>(MAXIMO_ELEMENTOS);
        this.MAXIMO_ELEMENTOS = MAXIMO_ELEMENTOS;
    }

    // toString
    @Override
    public String toString() {
        return "Pila{ " + "pila=" + pila + " }";
    }

  
    // Método para añadir elementos al final de la lista
    public void push(T aux) {
        if (!pilaLlena()) {
            this.pila.add(0, aux);
        }
    }

    // Método para sacar elementos
    public T pop() {
        return this.pila.remove(0);
    }

    // Método para saber los elementos que hay en la lista
    public int numElementosLista() {
        return this.pila.size();
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
    
    // Método que devuelve si está vacio o no.
    public boolean estaVacia(){
        return this.pila.isEmpty();
    }

    
    
    
}
