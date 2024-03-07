/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilafifogenerico;

/**
 *
 * @author tomas
 */
public class MainFifo {
    public static void main(String[] args) {
        PilaFifo<String> p = new PilaFifo<>(5);
        
        System.out.println("La pila tiene " + p.numElementosLista() + " elementos");
        p.push("Vico1");
        System.out.println(p.toString());

        System.out.println("La pila tiene " + p.numElementosLista() + " elementos");
        p.push("Vico2");
        System.out.println(p.toString());
        System.out.println("Se ha eliminado un elemento de la pila: " + p.pop());
        p.push("Vico3");
        p.push("Vico4");
        p.push("Vico5");
        p.push("Vico6");
        p.push("Vico7");
        System.out.println(p.toString());
        System.out.println("La pila tiene " + p.numElementosLista() + " elementos");
        
    }
}
