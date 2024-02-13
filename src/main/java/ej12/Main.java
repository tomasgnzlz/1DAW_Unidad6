/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Aiman", "aiman2", "notiene");
        Cuenta c1 = new CuentaCorriente(p1);
        System.out.println(c1.toString());
        
        
        
    }
    
}
