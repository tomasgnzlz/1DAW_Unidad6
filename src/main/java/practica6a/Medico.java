/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

/**
 *
 * @author tomas
 */
public class Medico extends Empleado implements Tratar {

    private Especialidad especialidad;

    // Constructores
    public Medico(Especialidad especialidad, String numeroSeguridadSocial, double sueldo, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, sueldo, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    // Getters y Setters
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // toString
    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public double calcularIRPF() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double total = 0;
        final double CIRUGIA = 25.0;
        final double OTROS = 23.5;
        if (especialidad == Especialidad.CIRUGIA) {
            total = this.getSueldo() * 1 + CIRUGIA;
        } else {
            total = this.getSueldo() * 1 + OTROS;
        }
        return total;
    }

    // Método para tratar a los pacientes
//    public void tratar(Paciente paciente, String medicina) {
//        System.out.println("El medico " + this.getNombre() + "trata a "
//                + paciente.getNombre() + " con " + medicina);
//        paciente.tomarMedicina(medicina);
//    }
    @Override
    public void tratar(Paciente paciente, String medicina) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("El medico " + this.getNombre() + "trata a "
                + paciente.getNombre() + " con " + medicina);
        paciente.tomarMedicina(medicina);
    }
}
