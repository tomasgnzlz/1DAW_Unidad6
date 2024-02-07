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
public class Museo { // contenedora

    // clases contenidas
    private String nombre;
    private String dirPostal;
    private Director director;
    private List<ObraArte> listaObras;

    public Museo(String nombre, String dirPostal, Director director, List<ObraArte> listaObras) {
        this.nombre = nombre;
        this.dirPostal = dirPostal;
        this.director = director;
        this.listaObras = listaObras;
    }

    public Museo() {
        this.nombre = "Reina Sofia";
        this.dirPostal = "Castellana, 33";
        this.director = new Director("Aiman", "321", 2000);
        this.listaObras = new ArrayList<>();
        rellenarListaObras();

    }

    public Museo(String nombre, String dir) {
        this.nombre = nombre;
        this.dirPostal = dir;
        this.director = new Director("Aiman", "321", 2000);
        this.listaObras = new ArrayList<>();
        rellenarListaObras();
    }

    private void rellenarListaObras() {
        this.listaObras.add(new ObraArte("Monalisa", "Pintura"));
    }

    public void añadirObra(ObraArte aux) {
        this.listaObras.add(aux);
    }

    public void quitarObra(ObraArte aux) {
        this.listaObras.remove(aux);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", dirPostal=").append(dirPostal);
        sb.append(", director=").append(director);
        sb.append(", listaObras=").append(listaObras);
        sb.append('}');
        return sb.toString();

    }

    public String getNombre() {
        return nombre;
    }

    public String getDirPostal() {
        return dirPostal;
    }

    public Director getDirector() {
        return director;
    }

    public List<ObraArte> getListaObras() {
        return listaObras;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

}
