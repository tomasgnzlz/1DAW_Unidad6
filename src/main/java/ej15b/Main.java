/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15b;

import ej15.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomas
 */
public class Main {

    public static void main(String[] args) {
        Diputado d1 = new Diputado(5, "MAlaga", "PSOE", "Aiman", "Aiman2");
        Diputado d2 = new Diputado(5, "MAlaga2", "PP", "Aiman2", "Aiman3");

        Senador s1 = new Senador(200, "Malaga3", "VOX", "Antonio", "Antonio2");
        Senador s2 = new Senador(200, "Malaga4", "VOX", "Eduardo", "Eduardo2");
        
        Alcalde a1 = new Alcalde("Si", "ovov", "bbb", "aaa", "AAA");

        List<Legislador> listaLegisladores = new ArrayList<>();
        listaLegisladores.add(d1);
        listaLegisladores.add(d2);
        listaLegisladores.add(s1);
        listaLegisladores.add(s2);
        listaLegisladores.add(a1);
        listaLegisladores.forEach(System.out::println);
        
        System.out.println("\n");
        
        
        ArrayList<DiputadoSenador> listaDiputadosSenadores = new ArrayList<>();
        
        for (Legislador o : listaLegisladores) {
            if (o instanceof DiputadoSenador) {
                listaDiputadosSenadores.add((DiputadoSenador) o);
            }
        }
        
        for (DiputadoSenador l : listaDiputadosSenadores) {
            System.out.println(l.getCamara());
        }

    }
}
