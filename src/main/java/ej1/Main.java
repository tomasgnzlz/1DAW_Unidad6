/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        Puerta puerta = new Puerta(Estados.CERRADA);
        List<Calefactor> listaCalefactores = new ArrayList<>();
        Calefactor c1 = new Calefactor();
        Calefactor c2 = new Calefactor();
        listaCalefactores.add(c1);
        listaCalefactores.add(c2);

        List<Ventana> listaVentanas = new ArrayList<>();
        Persiana p1 = new Persiana();
        Ventana v1 = new Ventana(p1);
        Ventana v2 = new Ventana();
        listaVentanas.add(v1);
        listaVentanas.add(v2);

        Casa casa = new Casa(puerta, listaCalefactores, listaVentanas);

        System.out.println(casa.toString());
    }
}
