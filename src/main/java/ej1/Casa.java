/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import java.util.List;

/**
 *
 * @author tomas
 */
public class Casa {

    private Puerta puerta;
    private List<Calefactor> listaCalefactores;
    private List<Ventana> listaVentanas;

    public Casa(Puerta puerta, List<Calefactor> listaCalefactores, List<Ventana> listaVentanas) {
        this.puerta = puerta;
        this.listaCalefactores = listaCalefactores;
        this.listaVentanas = listaVentanas;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public List<Calefactor> getListaCalefactores() {
        return listaCalefactores;
    }

    public List<Ventana> getListaVentanas() {
        return listaVentanas;
    }

    public void setListaCalefactores(List<Calefactor> listaCalefactores) {
        this.listaCalefactores = listaCalefactores;
    }

    public void setListaVentanas(List<Ventana> listaVentanas) {
        this.listaVentanas = listaVentanas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("puerta=").append(puerta);
        sb.append(", listaCalefactores=").append(listaCalefactores);
        sb.append(", listaVentanas=").append(listaVentanas);
        sb.append('}');
        return sb.toString();
    }

}
