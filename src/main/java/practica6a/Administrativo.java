/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

import java.time.LocalDate;

/**
 *
 * @author tomas
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    // Constructores
    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double sueldo, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, sueldo, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Administrativo() {
    }

    // Getters y Setters
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    // toString
    @Override
    public String toString() {
        return "Administrativo{" + "grupo=" + grupo + '}';
    }

    @Override
    public double calcularIRPF() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double total = 0;
        switch (grupo) {
            case C -> {
                total = this.getSueldo() * Grupo.C.irpf;
            }
            case D -> {
                total = this.getSueldo() * Grupo.D.irpf;
            }
            case E -> {
                total = this.getSueldo() * Grupo.E.irpf;
            }
        }
        return total;
    }

    public void registrarDocumento(String nombreDocumento) {
        System.out.println("El administrativo " + this.getNombre() + " registro el documento "
                + nombreDocumento + ". FechaRegistro: " + LocalDate.now());
    }

}
