/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package h2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author tomas
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Trabajador> lista = new ArrayList<>();
        //lista.add(new Trabajador("Maria", "1234A")); // Como la clase es abstracta, solo es una plantilla no se pueden crear objetos Trabajador.
        lista.add(new Enfermera("HospitalMaria","Maria", "1234A"));
        lista.add(new Policia("1234E","Maia", "1234A"));
        
        for (Trabajador t : lista) {
            t.cotizar();
        }
        
        Set<CursosReciclado> hacenCursos = new HashSet();
        hacenCursos.add(new Policia());
        hacenCursos.add(new Profesor());
        
        
        for (CursosReciclado hacenCurso : hacenCursos) {
            hacenCurso.hacerCurso(300);
            if (hacenCurso instanceof Policia) {
                ((Policia) hacenCurso).ponerDenuncia();
            }
        }
    }
    
}
