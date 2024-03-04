/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        
        List<Ordenador> litsta = new ArrayList<>();
        Ordenador o1 =new Ordenador(12, "DEll");
        Ordenador o2 =new Ordenador(12, "DEll");
        
        System.out.println(o1.equals(o2));
        
        Portatil port1 = new Portatil(true, 12, "DELL");
        Portatil port2 = new Portatil(true, 11, "DELL");
        
        System.out.println(port1.equals(port2));
    }
    
}
