/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class MiTienda {

    public static void main(String[] args) {
        /*1. Crea una lista de productos y añade dos objetos de cada tipo de 
        producto distinto (de los posibles) a la misma*/
        ArrayList<Producto> listaProductos = new ArrayList<>();
        Producto p1 = new Musica("uno", "1234", 5, 21, "Cancion1");
        Producto p2 = new Musica("dos", "5678", 5, 21, "Cancion2");

        Producto p3 = new Pantalon(40, "marca1", "9101112", 40, 20, "Pantalon1");
        Producto p4 = new Pantalon(41, "marca2", "13141516", 30, 20, "Pantalon2");

        Producto p5 = new LibroPapel(300, "abcd1", "17181920", 20, 10, "Libro1");
        Producto p6 = new LibroDigitall(600, "efgh2", "21222324", 15, 10, "Libro2");

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        listaProductos.add(p6);
        //2. Muestra los datos de los productos usando un foreach.
        listaProductos.forEach(System.out::println);

    }

}
