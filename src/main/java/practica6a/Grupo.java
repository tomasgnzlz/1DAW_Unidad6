/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package practica6a;

/**
 *
 * @author tomas
 */
public enum Grupo {
    C(17.5),
    D(18.0),
    E(18.5);

    double irpf;
    
    private Grupo(double irpf) {
        this.irpf = irpf;
    }
    
}
