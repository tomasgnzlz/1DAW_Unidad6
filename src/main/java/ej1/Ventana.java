/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author tomas
 */
public class Ventana {

    private Persiana persiana;
    private Estados estadoPersiana;

    public Ventana(Persiana persiana) {
        this.persiana = persiana;
    }

    public Ventana() {
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventana{");
        sb.append("persiana=").append(persiana);
        sb.append('}');
        return sb.toString();
    }

    public void abrir() {
        this.estadoPersiana = Estados.ABIERTA;
    }

    public void apagar() {
        this.estadoPersiana = Estados.CERRADA;
    }

}
