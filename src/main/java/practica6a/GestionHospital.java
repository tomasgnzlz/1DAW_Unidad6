/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6a;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class GestionHospital {

    private Hospital hospital;

    // constructor
    public GestionHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    // Métodos
    // No entiendo muy bien lo de crear estos metodos, donde los uso?
    public static Paciente crearPaciente(String numeroHistoria, String nombre, String apellidos, Nif nif) {
        return new Paciente(numeroHistoria, nombre, apellidos, nif);
    }

    public static Medico crearMedico(Especialidad especialidad, String numeroSeguridadSocial, double sueldo, String nombre, String apellidos, Nif nif) {
        return new Medico(especialidad, numeroSeguridadSocial, 0, nombre, apellidos, nif);
    }

    public static Administrativo crearPersonalPAS(Grupo grupo, String numeroSeguridadSocial, double sueldo, String nombre, String apellidos, Nif nif) {
        return new Administrativo(grupo, numeroSeguridadSocial, 0, nombre, apellidos, nif);
    }

    // Main
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        List<Paciente> listaPacientes = new ArrayList<>();
        Hospital hospital = new Hospital("tomas", "Aqui", 200, listaEmpleados, listaPacientes);

        // 5 Empleados
        Medico e1 = new Medico(Especialidad.CIRUGIA, "01", 5000, "tomas", "tomas2", new Nif());
        Medico e2 = new Medico(Especialidad.OTROS, "02", 2000, "tomas3", "tomas4", new Nif());

        Administrativo e3 = new Administrativo(Grupo.C, "03", 1500, "pepe1", "peposo1", new Nif());
        Administrativo e4 = new Administrativo(Grupo.D, "04", 2500, "pepe2", "peposo2", new Nif());
        Administrativo e5 = new Administrativo(Grupo.E, "05", 3500, "pepe3", "peposo3", new Nif());

        // añado los empleados a la lista
        hospital.contratarEmpleado(e1);
        hospital.contratarEmpleado(e2);
        hospital.contratarEmpleado(e3);
        hospital.contratarEmpleado(e4);
        hospital.contratarEmpleado(e5);

        // 5 Pacientes
        Paciente p1 = new Paciente("06", "juan1", "juanjo1", new Nif());
        Paciente p2 = new Paciente("07", "juan2", "juanjo2", new Nif());
        Paciente p3 = new Paciente("08", "juan3", "juanjo3", new Nif());
        Paciente p4 = new Paciente("09", "juan4", "juanjo4", new Nif());
        Paciente p5 = new Paciente("010", "juan5", "juanjo5", new Nif());

        // añado los pacientes a la lista
        hospital.ingresarPacientes(p1);
        hospital.ingresarPacientes(p2);
        hospital.ingresarPacientes(p3);
        hospital.ingresarPacientes(p4);
        hospital.ingresarPacientes(p5);
        //De entre los médicos y los pacientes del hospital, elige un médico y un 
        //paciente, aleatoriamente, para que ese medico trate a ese paciente con Pancetamol :)
        e2.tratar(p5, "Pancetamol :)");

        // Ejecuta el método abstracto de todos los empleados.
        System.out.println("");
        for (Empleado e : listaEmpleados) {
            if (e instanceof Administrativo) {
                System.out.println("El administrativo " + e.getNombre() + " IRPF: " + e.calcularIRPF() + "€");
            }
            if (e instanceof Medico) {
                System.out.println("El medico " + e.getNombre() + " IRPF: " + e.calcularIRPF() + "€");
            }
        }

        // Renueva el NIF a un paciente cualquiera.
        p1.renovarNif(LocalDate.now());

    }
}

