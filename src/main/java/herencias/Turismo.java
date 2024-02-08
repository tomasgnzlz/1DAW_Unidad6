/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencias;

/**
 *
 * @author tomas
 */
public class Turismo extends Vehiculo {
        private int numPuertas;

    public Turismo(int numPuertas, String matricula, String bastidor, String marca, Double tarifa) {
        super(matricula, bastidor, marca, tarifa);
        this.numPuertas = numPuertas;
    }

    public Turismo() {
        // La llamada al constructor sin parámetros está implicita
        super();
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return  super.toString() + "Turismo{" + "numPuertas=" + numPuertas + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.numPuertas;
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
        final Turismo other = (Turismo) obj;
        return this.numPuertas == other.numPuertas;
    }
    
    
    public void añadirRuedaRepuesto(){
        System.out.println("Añadio rueda repuesto");
    }
    
            
    
    
    
    
}
