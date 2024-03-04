/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosherencia;

/**
 *
 * @author tomas
 */
public class Musica extends Producto {

    // Declaración de atributos
    private String grupo;

    // Constructores
    public Musica() {
    }

    public Musica(String grupo, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    // Getters y Setters
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nMusica{" + "grupo=" + grupo + '}';
    }

}
