/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2;

/**
 *
 * @author tomas
 */
public abstract class Trabajador {

    private String nombre;
    private String nif;

    public Trabajador(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", nif=" + nif + '}';
    }
    
    public abstract void cotizar();

}
