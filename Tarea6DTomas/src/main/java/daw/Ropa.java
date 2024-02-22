/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author tomas
 */
public abstract class Ropa extends Producto implements SeEnvia {

    // Declaración de atirbutos
    private String marca;

    //Constructores
    public Ropa() {
    }

    public Ropa(String marca, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    // Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nRopa{" + "marca=" + marca + '}';
    }

    @Override
    public String enviar(String direccion) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return "Se envia la ropa " + this.getDescripcion() + " a la dirección: " + direccion;
    }

}
