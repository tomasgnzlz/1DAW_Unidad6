/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        System.out.println(d1.lanzar());
        
        Moneda m1 = new Moneda();
        System.out.println(m1.lanzar());
        
        
        ArrayList<Azar> listaAzares = new ArrayList<>();
        listaAzares.add(d1);
        listaAzares.add(m1);
        for (Azar listaAzare : listaAzares) {
            listaAzare.lanzar();
        }
        
    }
   
}
