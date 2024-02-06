/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooavanzao;

/**
 *
 * @author tomas
 */
public class Director { // Contenedora

    private String nombre;// clases contenidas
    private String nif;
    private double sueldo;

   
    
    public Director(String nombre, String nif, double Sueldo) {
        this.nombre = nombre;
        this.nif = nif;
        this.sueldo = sueldo;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Director{");
        sb.append("nombre=").append(nombre);
        sb.append(", nif=").append(nif);
        sb.append('}');
        return sb.toString();
    }

}
