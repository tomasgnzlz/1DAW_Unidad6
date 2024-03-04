/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosherencia;

import java.util.Objects;

/**
 *
 * @author tomas
 */
public abstract class Libro extends Producto implements Comparable<Libro> {

    // Declaraciónd e variables
    private String isbn;

    //Constructores
    public Libro() {
    }

    public Libro(String isbn, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nLibro{" + "isbn=" + isbn + '}';
    }

    //Equals y HashCode
    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.isbn);
        //
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    @Override
    public int compareTo(Libro o) {
        return this.isbn.compareToIgnoreCase(o.isbn);
    }
    
    // Me invento el metodo abstracto
    public abstract boolean megusta();

}
