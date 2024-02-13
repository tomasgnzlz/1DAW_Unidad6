/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2;

/**
 *
 * @author tomas
 */
public class Policia  extends Trabajador implements CursosReciclado{
    private String numPlaca;

    public Policia(String numPlaca, String nombre, String nif) {
        super(nombre, nif);
        this.numPlaca = numPlaca;
    }

    public Policia() {
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    @Override
    public String toString() {
        return super.toString() +"\nPolicia{" + "numPlaca=" + numPlaca + '}';
    }
    
    public void ponerDenuncia(){
        System.out.println("poniendo Denuncia");
    }
    
    public void cotizar(){
        System.out.println("Cotizando como pOLICIA");
    }

    @Override
    public void hacerCurso(int numHoras) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Policia hace curso de " + numHoras + " Horas");
        
        if (numHoras>200) {
            System.out.println("subir sueldo a policia");
        }
    }
    
    
    
}
