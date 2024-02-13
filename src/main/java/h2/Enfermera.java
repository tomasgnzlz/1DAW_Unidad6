/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2;

/**
 *
 * @author tomas
 */
public class Enfermera  extends Trabajador{
    private  String hospital;

    public Enfermera(String hospital, String nombre, String nif) {
        super(nombre, nif);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEnfermera{" + "hospital=" + hospital + '}';
    }
    
    // sobreescritura del metodo cotizar
    @Override
    public void cotizar(){
        System.out.println("Cotizando como enfermera");
    }
    
    public void ponerVacuna(String nombreVacuna){
        System.out.println(super.getNombre() + " está poniendo la vacuna "+ nombreVacuna);
    }
    
     
    
}
