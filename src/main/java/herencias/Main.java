/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

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
    }
    
}
