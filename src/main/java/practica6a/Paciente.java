/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Paciente extends Persona {

    private String numeroHistoria;

    // Constructores
    public Paciente(String numeroHistoria, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente() {
    }

    // Getters y Setters
    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    // toString
    @Override
    public String toString() {
        return "Paciente{" + "numeroHistoria=" + numeroHistoria + '}';
    }

    // Método que dice que medicina ha tomado el paciente
    public void tomarMedicina(String medicina) {
        System.out.println("El paciente " + this.getNombre() + " ha tomado: " + medicina
                + ".\n ¿Se ha curado? " + new Random().nextBoolean());
    }

}
