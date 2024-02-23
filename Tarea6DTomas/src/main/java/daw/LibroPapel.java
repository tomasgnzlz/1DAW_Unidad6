/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author tomas
 */
public final class LibroPapel extends Libro implements SeEnvia{
    
    private int numPaginas;
    
    // Constructores
    public LibroPapel() {
    }

    public LibroPapel(int numPaginas, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
    }
    
    // Getters y Setters
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    // toString
    @Override
    public String toString() {
        return super.toString() + "\nLibroPapel{" + "numPaginas=" + numPaginas + '}';
    }

    @Override
    public void enviar(String direccion) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Se envia el Libro " + this.getDescripcion() + " a la dirección: " + direccion);
    }

    @Override
    public boolean megusta() {
        return new Random().nextBoolean();
    }
    
    
}
