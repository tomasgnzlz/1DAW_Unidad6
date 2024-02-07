/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author tomas
 */
public class Persiana {

    Estados estadoPersiana;

    public Persiana() {
        this.estadoPersiana = Estados.ABIERTA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persiana{");
        sb.append("estadoPersiana=").append(estadoPersiana);
        sb.append('}');
        return sb.toString();
    }

    public void subirPersiana() {
        this.estadoPersiana = Estados.SUBIDA;
    }

    public void bajarPersiana() {
        this.estadoPersiana = Estados.SUBIDA;
    }

}
