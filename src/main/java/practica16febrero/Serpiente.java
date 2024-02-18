/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16febrero;

import java.util.ArrayList;

/**
 *
 * @author tomas
 */
public class Serpiente {

    public static void main(String[] args) {

        int[][] matriz = new int[8][8];
        ArrayList<Celda> listaCeldas = new ArrayList<>();
        rellenarMatrizChar(matriz);
        matriz[2][2] = 1;
        matriz[2][3] = 1;
        matriz[2][4] = 1;
        matriz[2][5] = 1;
        matriz[3][5] = 1;
        matriz[4][2] = 1;
        matriz[4][3] = 1;
        matriz[4][4] = 1;
        matriz[4][5] = 1;
        matriz[5][2] = 1;
        matriz[6][2] = 1;

        mostrarMatriz(matriz);
        System.out.println("********Celdas********");
        buscarPrimerValor(matriz, listaCeldas);

        // le paso el cero para que empiece a buscar a partir de la primera posicion de la lista,
        // que es el primer 1 que he encontrado
        buscarSigueintes(matriz, listaCeldas, 0);
        listaCeldas.forEach(System.out::println);

    }

    public static void rellenarMatrizChar(int[][] matrizAux) {
        int random = 0;
        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                matrizAux[i][j] = random;
            }
        }
        //return matrizAux;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("");
    }

    public static void buscarPrimerValor(int[][] matriz, ArrayList<Celda> listaCeldas) {
        boolean salir = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    matriz[i][j] = 3;
                    listaCeldas.add(new Celda(i, j));
                    salir = true;
                    if (salir) {
                        break;
                    }
                }
            }
            if (salir) {
                break;
            }
        }
        salir = false;
    }

    // le paso la celda que quiero buscar
    public static void buscarSigueintes(int[][] matriz, ArrayList<Celda> listaCeldas, int posicionLista) {
        // recorro la lista y 
        int pI = listaCeldas.get(posicionLista).getX();
        int pJ = listaCeldas.get(posicionLista).getY();

        mostrarMatriz(matriz);

        if (matriz[pI][pJ + 1] == 1) { // derecha
            matriz[pI][pJ + 1] = 3;
            listaCeldas.add(new Celda(pI, pJ + 1));

            // vuelvo a llamar a este metodo para que busque a partir del siguiente elemento de la lista a la que meto los valores
            posicionLista++;
            buscarSigueintes(matriz, listaCeldas, posicionLista);
        } else if (matriz[pI][pJ - 1] == 1) { // izquierda
            matriz[pI][pJ - 1] = 3;
            listaCeldas.add(new Celda(pI, pJ - 1));

            // vuelvo a llamar a este metodo para que busque a partir del siguiente elemento de la lista a la que meto los valores
            posicionLista++;
            buscarSigueintes(matriz, listaCeldas, posicionLista);
        } else if (matriz[pI - 1][pJ] == 1) { // arriba
            matriz[pI - 1][pJ] = 3;
            listaCeldas.add(new Celda(pI - 1, pJ));

            // vuelvo a llamar a este metodo para que busque a partir del siguiente elemento de la lista a la que meto los valores
            posicionLista++;
            buscarSigueintes(matriz, listaCeldas, posicionLista);

        } else if (matriz[pI + 1][pJ] == 1) { // abajo
            matriz[pI + 1][pJ] = 3;
            listaCeldas.add(new Celda(pI + 1, pJ));

            // vuelvo a llamar a este metodo para que busque a partir del siguiente elemento de la lista a la que meto los valores
            posicionLista++;
            buscarSigueintes(matriz, listaCeldas, posicionLista);
        }
    }

}
