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
public final class LibroDigitall extends Libro implements SeDescarga {

    private double numKBytes;

    // Constructores
    public LibroDigitall() {
    }

    public LibroDigitall(double numKBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    // Getters y Setters
    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nLibroDigitall{" + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descargar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("http;//tomas.daw/" + this.hashCode());
    }

    @Override
    public boolean megusta() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return new Random().nextBoolean();
    }

}
