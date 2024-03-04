/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosherencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author tomas
 */
public class MiTienda {

    public static void main(String[] args) {
        /*1. Crea una lista de productos y añade dos objetos de cada tipo de 
            producto distinto (de los posibles) a la misma*/
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        // La creacion de productos son conversions implicitas, porque son Musica,Pantalones o Libros, pero tambien on productos
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
        // usando expresión lambda:
        listaProductos.forEach(p -> System.out.println(p));

        //3. Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y
        //   una expresión lambda. Muestra la lista de productos ordenados por precio.
        System.out.println("\n+++++++++++++++++++++++ORDENO_POR_PRECIO+++++++++++++++++++++++\n");
        Comparator<Producto> ordenaPorPrecio = (pa, pb) -> Double.compare(pa.getPrecio(), pb.getPrecio());
        Collections.sort(listaProductos, ordenaPorPrecio);
        listaProductos.forEach(System.out::println);

        //4. Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y
        //   una expresión lambda. Muestra la lista de productos ordenados por código.
        System.out.println("\n+++++++++++++++++++++++ORDENO_POR_CODIGO+++++++++++++++++++++++\n");
        Comparator<Producto> ordenaPorCodigo = (pa, pb) -> pa.getCodigo().compareToIgnoreCase(pb.getCodigo());
        Collections.sort(listaProductos, ordenaPorCodigo);
        listaProductos.forEach(System.out::println);

        //5. Realiza la búsqueda binaria, según su código, de algún producto que exista dentro
        //   de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
        System.out.println("\n+++++++++++++++++++++++BUSQUEDA_BINARIA+++++++++++++++++++++++\n");

        /* LA BUSQUEDA BINARIA ES: 
            - LA LISTA EN LA QUE QUIERO BUSCAR EL ELEMENTOS
            - EL ELEMENTO QUE QUIERO BUSCAR EN LA LISTA
            - EL CRITERIO DE ORDENACIÓN MEDIANTE EL CUAL VOY A REALIZAR LA BUSQUEDA( si busco por id ordeno por id)
        */
        System.out.print("El producto: " + p6.getDescripcion() + " está en la posición: ");
        System.out.println(Collections.binarySearch(listaProductos, p6, ordenaPorCodigo));
        //6. Recorre la lista de productos y guarda todos los libros en una lista de libros.
        System.out.println("\n+++++++++++++++++++++++CREO_LISTA_LIBROS+++++++++++++++++++++++\n");
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for (Producto lp : listaProductos) { 
            if (lp instanceof Libro) { // Conversion Implicitas
                listaLibros.add((Libro) lp); // Conversion Explicitas
            }
        }
        listaLibros.forEach(System.out::println);

        //7. Muestra los datos de la lista de libros usando un objeto Iterator.
        System.out.println("\n+++++++++++++++++++++++MUESTRO_LISTA_ITERATOR+++++++++++++++++++++++\n");
        Iterator<Libro> iterador = listaLibros.iterator();
        while (iterador.hasNext()) {
            Libro nextElement = iterador.next();
            System.out.println(nextElement);
        }

        //8. Ordena los libros según ISBN, haciendo uso de <<Comparable>>. Muestra la lista de libros ordenada.
        System.out.println("\n+++++++++++++++++++++++ORDENO_POR_ISBN+++++++++++++++++++++++\n");
        //        Comparator<Libro> ordenaPorisbn = (pa, pb) -> pa.getIsbn().compareToIgnoreCase(pb.getIsbn());
        //        Collections.sort(listaLibros, ordenaPorisbn);
        // Ya está implementado en la clase
        listaLibros.forEach(System.out::println);

        //9. Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("\n+++++++++++++++++++++++INTERFACES_ LIBRO+++++++++++++++++++++++\n");
        String direccion = "miCasa";
        for (Libro l : listaLibros) {
            if (l instanceof LibroPapel) { // Conversion Implicitas
                ((LibroPapel) l).enviar(direccion); // ConversionExplicita
            }
            if (l instanceof LibroDigitall) { // Conversion Implicitas
                ((LibroDigitall) l).descargar(); // ConversionExplicita
            }
        }

        //10. Indica las líneas de código donde se realizan conversiones implícitas y/o explícitas.
        //11. Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        System.out.println("\n+++++++++++++++++++++++LISTA_CONTIENE_LIBRO+++++++++++++++++++++++\n");
        System.out.println("¿El libro " + p6.getDescripcion() + " está en la lista? " + listaLibros.contains(p6));

        //12. Usando la lista de productos inicial, crea una nueva lista con todos los objetos que Se Envian.
        System.out.println("\n+++++++++++++++++++++++LISTA_CON_INTERFAZ_SEENVIAN+++++++++++++++++++++++\n");
        ArrayList<SeEnvia> listaProductosInterfazSeEnvian = new ArrayList<>();

        for (Producto l : listaProductos) {
            if (l instanceof SeEnvia) { // Conversion Implicitas
                listaProductosInterfazSeEnvian.add((SeEnvia) l); // Conversion Explicita
            }
        }
        listaProductosInterfazSeEnvian.forEach(System.out::println);

        //13. Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        System.out.println("\n+++++++++++++++++++++++PRUEBA_METODO_SEENVIAN+++++++++++++++++++++++\n");
        for (SeEnvia seEnvia : listaProductosInterfazSeEnvian) {
            seEnvia.enviar(direccion);
        }   

        //14. Inventa un método abstracto en Libro que tenga comportamientos diferentes en las
        //    subclases. Implementa los métodos en las clases hijas.
        System.out.println("\n+++++++++++++++++++++++METODO_INVENTADO+++++++++++++++++++++++\n");
        for (Libro l : listaLibros) {
            System.out.println("El libro " + l.getDescripcion() + " me gusta? " + l.megusta());
        }
    }

}
