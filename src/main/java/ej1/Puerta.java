/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author tomas
 */
public class Puerta {

    Estados estadoPuerta;

    public Puerta(Estados estadoPuerta) {
        this.estadoPuerta = estadoPuerta;
    }

    public void abrir() {
        this.estadoPuerta = Estados.ABIERTA;
    }

    public void apagar() {
        this.estadoPuerta = Estados.CERRADA;
    }

}
