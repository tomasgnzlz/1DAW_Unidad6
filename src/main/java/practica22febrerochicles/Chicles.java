/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica22febrerochicles;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Chicles {
    
    public static void main(String[] args) {
        boolean salir = false;
        String opcionSalir = "";
        Scanner teclado = new Scanner(System.in);
        int numeroEnvoltoriosNecesarios = 0;
        int numeroChiclesRegalarEnFuncionComprados = 0;
        int numeroChiclesComprados = 0;

        do {
            numeroEnvoltoriosNecesarios = numerosEnvoltorios();
            numeroChiclesRegalarEnFuncionComprados = numerosChiclesRegalar();
            numeroChiclesComprados = numerosChiclesCompradosCafeteria();

            System.out.println(viabilidadCafeteria(numeroEnvoltoriosNecesarios, numeroChiclesRegalarEnFuncionComprados, numeroChiclesComprados));

            // una vez se ejecuta lo anterior;
            System.out.println("Desea repetir el programa ('s' o 'S' para repetir)");
            opcionSalir = teclado.nextLine();
            if (opcionSalir.equalsIgnoreCase("s")) {
                salir = false;
                System.out.println("ha decidido repetir el programa");
            } else {
                salir = true;
                System.out.println("ha decidido salir");
            }
        } while (!salir);

    }

    //Número de envoltorios necesarios para que nos regalen más chicles.
    public static int numerosEnvoltorios() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce el número de envoltorios necesarios para que nos regalen mas chicles");
        num = teclado.nextInt();
        return num;
    }

    // Número de chicles a regalar en función del número anterior.
    public static int numerosChiclesRegalar() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce el número de chicles a regalar segun los envoltorios");
        num = teclado.nextInt();
        return num;
    }

    // Número de chicles que se han comprado en la cafetería.
    public static int numerosChiclesCompradosCafeteria() {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("Introduce el número de chicles que has comprado en la cafeteria");
        num = teclado.nextInt();
        return num;
    }

    public static String viabilidadCafeteria(int numeroEnvoltoriosNecesarios,
            int numeroChiclesRegalarEnFuncionComprados,
            int numeroChiclesComprados) {

        boolean viable = false;

        /*En el momento en el que me quede sin envoltrios para poder canjear por
        mas chicles la cafeteria no es viable*/
        int numeroEnvoltoriosSobran = 0;
        int numeroChiclesTotales = 0;
        int chiclesRegalados = 0;
        int numAux = 0;

        // no se me ejecuta iquiera
        do {
            numAux = (numeroChiclesComprados / numeroEnvoltoriosNecesarios);
            numeroChiclesTotales = numeroChiclesComprados + numAux;
            chiclesRegalados = (numeroChiclesComprados / numeroEnvoltoriosNecesarios);
            numeroEnvoltoriosSobran = (chiclesRegalados / numeroEnvoltoriosNecesarios);
        } while (numeroEnvoltoriosSobran < numeroEnvoltoriosNecesarios);

        if (numeroEnvoltoriosSobran < numeroEnvoltoriosNecesarios) {
            viable = true;
        } else {
            viable = false;
        }
        String textBlock = """
                          ----------------------------------------------------------------
                          La campaña es viable? -> %b
                          Me he comido un total de %d chicles y me sobraron %d envoltorios
                          ----------------------------------------------------------------
                          """.formatted(viable, numeroChiclesTotales, numeroEnvoltoriosSobran);
        return textBlock;
    }
    
}
