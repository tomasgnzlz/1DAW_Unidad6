/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooavanzaoexplicacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
//        Museo museo = new Museo();
//        System.out.println(museo.toString());
//        museo.añadirObra(new ObraArte("Monalisa2", "pintura"));
//        System.out.println(museo.toString());
        List<ObraArte> listaObras = new ArrayList<>();
        listaObras.add(new ObraArte("Monalisa", "^Pintura"));
        listaObras.add(new ObraArte("Monalisa2", "^Pintura"));
        Museo reinaSofia = new Museo("Aiman", "Castellana, 33", new Director("aiman", "321", 0), listaObras);
        System.out.println(reinaSofia.toString());

    }

}
