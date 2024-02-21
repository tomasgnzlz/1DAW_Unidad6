/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

/**
 *
 * @author tomas
 */
public abstract class Empleado extends Persona {

    private String numeroSeguridadSocial;
    private double sueldo;

    // Constructores
    public Empleado(String numeroSeguridadSocial, double sueldo, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    // Getters y Setters
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado{" + "numeroSeguridadSocial=" + numeroSeguridadSocial + ", sueldo=" + sueldo + '}';
    }

    public abstract double calcularIRPF();

}
