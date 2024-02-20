/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15b;

/**
 *
 * @author tomas
 */
public class Alcalde  extends Legislador{
    private String ciudadAlcalde;

    public Alcalde(String ciudadAlcalde, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.ciudadAlcalde = ciudadAlcalde;
    }

    public Alcalde() {
    }

    public String getCiudadAlcalde() {
        return ciudadAlcalde;
    }

    public void setCiudadAlcalde(String ciudadAlcalde) {
        this.ciudadAlcalde = ciudadAlcalde;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAlcalde{" + "ciudadAlcalde=" + ciudadAlcalde + '}';
    }
    
    
    
    
    
}
