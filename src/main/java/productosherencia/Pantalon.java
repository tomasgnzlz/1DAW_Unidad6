/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosherencia;

/**
 *
 * @author tomas
 */
public final class Pantalon extends Ropa {

    //Declaración de atributos
    private double talla;

    //Constructores
    public Pantalon() {
    }

    public Pantalon(double talla, String marca, String codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    

    // Getters & Setters
    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nPantalon{" + "talla=" + talla + '}';
    }

}
