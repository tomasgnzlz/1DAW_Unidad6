/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Calefactor {

    private int temperatura;
    Estados estadoCalefactor;

    public Calefactor() {
        this.temperatura = 0;
        this.estadoCalefactor = Estados.APAGADO;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calefactor{");
        sb.append("temperatura=").append(temperatura).append("ºC");
        sb.append(", estadoCalefactor=").append(estadoCalefactor);
        sb.append('}');
        return sb.toString();
    }

    public void encender() {
        this.estadoCalefactor = Estados.ENCENDIDO;
    }

    public void apagar() {
        this.estadoCalefactor = Estados.APAGADO;
    }

    public void fijarTemperatura(int temperatura) {
        // controlar que ...
        this.temperatura = temperatura;
    }

}
