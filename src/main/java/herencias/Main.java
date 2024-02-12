/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("123", "456Y","Citroen", 23.56);
        System.out.println(v1);
        
        Turismo tusi = new Turismo(8, "888", "999P", "Renault", 10.6);
        System.out.println(tusi);
        // cuando uso la variable de la subclase tengo acceso a los atributos de la superclase  
        
        Furgoneta f1 = new Furgoneta(200, "123a","456b", "aiman", 12.0);
        f1.aumentarCarga(10);
        List<Vehiculo> lista = new ArrayList<>();
        // conversiones implicitas. Casting implicito
        // aunq la variable sea tusismo o furgoneta, la estoy apuntoando por vehiculo
        // lo que implica que solo tengo acceso a los metodos de vehiculo dentro de esta lista
        lista.add(v1);
        lista.add(tusi);
        lista.add(f1);
        
        
        for (Vehiculo v : lista) {
            // Método polimorfico toString
            //en funcion del tipo al que apunte se ejecute un codigo u otro
            System.out.println(v.toString());
            
            if (v instanceof Turismo) {
                ((Turismo) v).añadirRuedaRepuesto();
            }
            
            if (v instanceof Furgoneta) {
                ((Furgoneta) v).aumentarCarga(5);
            }
        }
        
    }
    
}
