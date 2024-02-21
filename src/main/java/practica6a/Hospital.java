/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

import java.util.List;

/**
 *
 * @author tomas
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Empleado> listaEmpleados;
    private List<Paciente> listaPacientes;

    // Constructores
    public Hospital(String nombre, String direccion, int numeroCamas, List<Empleado> listaEmpleados, List<Paciente> listaPacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpleados = listaEmpleados;
        this.listaPacientes = listaPacientes;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append(", listaEmpleados=").append(listaEmpleados);
        sb.append(", listaPacientes=").append(listaPacientes);
        sb.append('}');
        return sb.toString();
    }

    // Método para contrtatar empleados
    public void contratarEmpleado(Empleado empleadoAux) {
        this.listaEmpleados.add(empleadoAux);
    }

    public void ingresarPacientes(Paciente pacienteAux) {
        this.listaPacientes.add(pacienteAux);
    }

}
