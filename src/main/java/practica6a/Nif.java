/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public class Nif {

    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    // Le quito los parametros para que se genere automatico. 
    public Nif() {
        Random rd = new Random();
        this.numero = generarNumero();
        this.letra = generarLetra();
        this.fechaCaducidad = LocalDate.now().plusYears(rd.nextInt(5));
    }

    public static String generarNumero() {
        return RandomStringUtils.randomNumeric(8);
    }

    public static char generarLetra() {
        String string = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        return string.charAt(0);
    }

    // Getters y Setters
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    // toString
    @Override
    public String toString() {
        //return "Nif{" + "numero=" + numero + ", letra=" + letra + ", fechaCaducidad=" + fechaCaducidad + '}';
        return numero + letra + ", FechaCaducidad:" + fechaCaducidad + " ";
    }

    // Equals & HashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.numero);
        hash = 59 * hash + this.letra;
        hash = 59 * hash + Objects.hashCode(this.fechaCaducidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.letra != other.letra) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return Objects.equals(this.fechaCaducidad, other.fechaCaducidad);
    }

    public LocalDate renovar(LocalDate fechaSolicitudRenovacion) {
        return this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }

}
