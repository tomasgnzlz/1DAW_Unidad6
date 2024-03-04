/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equals;

/**
 *
 * @author tomas
 */
public class Portatil extends Ordenador{
    private boolean  tecladoExtra;

    public Portatil(boolean tecladoExtra, double precio, String marca) {
        super(precio, marca);
        this.tecladoExtra = tecladoExtra;
    }

  

    public Portatil() {
    }

    public boolean isTecladoExtra() {
        return tecladoExtra;
    }

    public void setTecladoExtra(boolean tecladoExtra) {
        this.tecladoExtra = tecladoExtra;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.tecladoExtra ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Portatil other = (Portatil) obj;
        return this.tecladoExtra == other.tecladoExtra;
    }

    @Override
    public String toString() {
        return "Portatil{" + "tecladoExtra=" + tecladoExtra + '}';
    }
    
    
    
}
