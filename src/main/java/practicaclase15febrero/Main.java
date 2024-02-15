/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaclase15febrero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Viaje> listaViajes = getListaViajes();
        System.out.println(listaViajes);
        // Prueba metodo1
        System.out.println("********************METOOD1********************");
        Map<String, Integer> estructura = metodo1(listaViajes);
        mostrarMapForEach(estructura);
        System.out.println("");
        // Prueba metood2
        System.out.println("********************METOOD2********************");
        Set<String> setDestinos = metodo2(listaViajes);
        mostrarSetIterador(setDestinos);
        System.out.println("");

        // Prueba metodo3
        Map<String, Integer> estructura2 = metodo3(listaViajes);
        System.out.println("********************METOOD3********************");
        mostrarMapForEach(estructura2);
        System.out.println("");

        // Prueba metood4
        System.out.println("********************METOOD4********************");
        metodo4(listaViajes);

    }
    //----------------------------------------
    // ABRE EL ARCHIVO POM.XML, MODIFICA EL CONTENIDO QUE HAY ENTRE LAS ETIQUETAS
    // <artifactId>PruebaFeb24</artifactId> PARA QUE SEA <artifactId>PruebaFeb24+TUNOMBRE</artifactId>

    // CREA UN REPOSITORIO LOCAL GIT, AÑADE EN UN PRIMER COMMIT LOS ARCHIVOS NECESARIOS
    // DEL PROYECTO. EL REPOSITORIO, AL FINALIZAR LA PRUEBA, DEBE CONTENER CUATRO COMMITS, UNO POR CADA
    // APARTADO. AL CREAR EL ZIP, INCLUYE LA CARPETA .GIT. SI NO HAY CONTROL DE VERSIONES CORRECTO
    // NO SE CORRIGE EL RESTO
    //---------------------------------------
    // A.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // / con el número de viajes que salen de cada ciudad de origen. Usa el método en el main
    // e imprime el resultado usando un foreach
    public static Map<String, Integer> metodo1(ArrayList<Viaje> lista) {
        Map<String, Integer> estructura = new HashMap<>();
        for (Viaje v : lista) {
            if (estructura.containsKey(v.origen())) {
                int viajesAnteriores = estructura.get(v.origen());
                estructura.put(v.origen(), viajesAnteriores + 1);
            } else {
                estructura.put(v.origen(), 1);
            }
        }

        return estructura;
    }

    // B.- Crea un método que reciba la lista y devuelva una estructura de datos/colección 
    // con todos los destinos diferentes. Usa el método en el main
    // e imprime el resultado usando un iterador
    public static Set<String> metodo2(ArrayList<Viaje> lista) {
        Set<String> setDestinos = new HashSet<>();
        for (int i = 0; i < lista.size(); i++) {
            for (Viaje viaje : lista) {
                setDestinos.add(viaje.destino());
            }
        }
        return setDestinos;
    }

    public static void mostrarSetIterador(Set<String> setAux) {
        Iterator<String> iterador = setAux.iterator();
        while (iterador.hasNext()) {
            String s = iterador.next();
            System.out.println(s);
        }
    }

    // C.- Crea un método que reciba la lista y devuelva una estructura de datos/colección
    // para saber por cada ciudad destino el número total de viajeros que llegan ese día
    // Usa el método en el main, obten las claves de la estructura devuelta e iterando por ellas imprime 
    // el número de viajeros por ciudad
    public static Map<String, Integer> metodo3(ArrayList<Viaje> lista) {
        Map<String, Integer> estructura = new HashMap<>();
        // recorro la lista
        int sumaPasajeros = 0;

        for (Viaje v : lista) {
            if (estructura.containsKey(v.origen())) {
                // ese destino ya eta en el map, solo se tiene que actualizar la variable
                sumaPasajeros = estructura.get(v.origen());
                estructura.put(v.origen(), sumaPasajeros + v.numeroPasajeros());
            } else {
                estructura.put(v.origen(), v.numeroPasajeros());
            }
        }

        return estructura;
    }

    public static void mostrarMapForEach(Map<String, Integer> estructura) {
        for (Map.Entry<String, Integer> est : estructura.entrySet()) {
            System.out.println("Destino: " + est.getKey() + " - Pasajeros: " + est.getValue());
        }
    }

    // D.- Crea un método que reciba la lista y la ordene por destino y si hay
    // destinos iguales se ordenan por número de viajeros. Usa el método en el main
    // e imprime el resultado usando foreach con expresión lambda, para obtener
    // una salida como esta por cada elemento: "Destino: Estepona Viajeros: 35" 
    public static void metodo4(ArrayList<Viaje> listaAux) {
        Comparator<Viaje> porNumeroViajeros = (e1, e2) -> Integer.compare(e1.numeroPasajeros(), e2.numeroPasajeros());
        Comparator<Viaje> porDestino = (d1, d2) -> d1.destino().compareToIgnoreCase(d2.destino());
        Collections.sort(listaAux, porDestino.thenComparing(porNumeroViajeros));

        // Lo muestro
        listaAux.forEach(elemento -> System.out.println("Destino: " + elemento.destino() + " Viajeros: " + elemento.numeroPasajeros()));
    }

    //---------------------------------------
    private static ArrayList<Viaje> getListaViajes() {
        ArrayList<Viaje> listaViajes = new ArrayList();
        // Origen - destino - número de pasajeros
        listaViajes.add(new Viaje("Estepona", "Málaga", 120));
        listaViajes.add(new Viaje("Estepona", "Granada", 45));
        listaViajes.add(new Viaje("Estepona", "Algeciras", 100));
        listaViajes.add(new Viaje("Algeciras", "Málaga", 20));
        listaViajes.add(new Viaje("Algeciras", "Granada", 50));
        listaViajes.add(new Viaje("Granada", "Estepona", 35));
        listaViajes.add(new Viaje("Casares", "Málaga", 12));
        listaViajes.add(new Viaje("Marbella", "Málaga", 120));

        return listaViajes;
    }
}
