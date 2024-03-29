/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dawfood;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.UUID;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class TPV {

    private UUID id;
    private String ubicacion;
    private LocalDateTime fechaHora;
    private ArrayList<Ticket> listaTicketsVentas = new ArrayList<>();

    // Constructor con parámetros.
    public TPV(UUID id, String ubicacion, LocalDateTime fechaHora) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.fechaHora = fechaHora;
    }

    // Constructor sin parámetros.
    public TPV() {
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public ArrayList<Ticket> getListaTicketsVentas() {
        return listaTicketsVentas;
    }

    public void setListaTicketsVentas(ArrayList<Ticket> listaTicketsVentas) {
        this.listaTicketsVentas = listaTicketsVentas;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TPV{");
        sb.append("id=").append(id);
        sb.append(", ubicacion=").append(ubicacion);
        sb.append(", fechaHora=").append(fechaHora);
        sb.append('}');
        return sb.toString();
    }

    public void encenderTPV() {
        int tipoUsuario = 9999;
        int tipoComida = 9999;
        // reseteo los valores de estas
        boolean salirPrimario = false;
        boolean salirSecundario = false;
        boolean idvalido = false;
        boolean admin = false;
        boolean subconsulta = false;
        ArrayList<Producto> listaProductos = Producto.listaProductos(); // La lista de todos los productos que hay
        ArrayList<Producto> listaProductosSeleccionados = new ArrayList<>(); // La lista de los productos que se seleccionan(los que van al ticket)
        //
        //
        //
        // Nuevo carrito con el MAP
        Map<Integer, Integer> mapProductos = new HashMap<>();
        //
        //
        //
        
        do {
            salirPrimario = false;
            salirSecundario = false;
            idvalido = false;

            tipoUsuario = seleccionarTipoUsuario();
            switch (tipoUsuario) {
                case 0 -> {//TIPO USUARIO
                    do {
                        tipoComida = UtilidadesUsuario.opcionesMenu();
                        switch (tipoComida) {
                            case 0 -> {

                                int idProductoDeseado = UtilidadesUsuario.preguntarIDProductoComida(listaProductos);
                                listaProductosSeleccionados = UtilidadesUsuario.añadirAlCarrito(listaProductosSeleccionados, listaProductos, idProductoDeseado);
                                //
                                //
                                //
                                System.out.println("**********PRUEBA_MAP**********");
                                mapProductos = UtilidadesUsuario.carritoMAP(idProductoDeseado, listaProductos);
                                //
                                //
                                //
                            }
                            case 1 -> {

                                int idProductoDeseado = UtilidadesUsuario.preguntarIDProductoBebida(listaProductos); // Cuando pongo la lista de solo bebidas no me deja escoger ningun id.
                                listaProductosSeleccionados = UtilidadesUsuario.añadirAlCarrito(listaProductosSeleccionados, listaProductos, idProductoDeseado);

                            }
                            case 2 -> {
                                int idProductoDeseado = UtilidadesUsuario.preguntarIDProductoPostres(listaProductos);
                                listaProductosSeleccionados = UtilidadesUsuario.añadirAlCarrito(listaProductosSeleccionados, listaProductos, idProductoDeseado);

                            }

                            case 3 -> {

                                if (listaProductosSeleccionados.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "El carrito está vacio");
                                } else {
                                    // PUEDO CREAR LA TARJETA AHORA, PARA QUE SI 1 TARJETA NO TIENE SALDO
                                    // SE SALGA DEL PROCESO DE COMPRA Y SE USE OTRA TARJETA PARA
                                    Tarjeta tarjeta = Tarjeta.generarTarjeta("Aiman/Tomas");
                                    //
                                    //
                                    //
                                    UtilidadesUsuario.mostrarMap(mapProductos, listaProductos);
                                    System.out.println("MUESTRO EL MAP");
                                    System.out.println(mapProductos.toString());
                                    //
                                    //
                                    //
                                    
                                    int decisionComprar = UtilidadesUsuario.verCarrito(listaProductosSeleccionados);

                                    switch (decisionComprar) {
                                        case 0 -> { // Cuando escoge la opción comprar
                                            boolean verificado = UtilidadesUsuario.pasarelaDePago2(listaProductosSeleccionados, tarjeta);
                                            if (verificado) {
                                                Ticket t = new Ticket(listaProductosSeleccionados);
                                                JOptionPane.showMessageDialog(null, t.toString());
                                                System.out.println(t.toString());
                                                listaTicketsVentas.add(t);
                                                // Enseño el ticket
                                                for (Ticket ticketsLista : listaTicketsVentas) {
                                                    System.out.println(ticketsLista);
                                                }
                                                // Una vez se muestre el ticket y se haya realizado la compra
                                                salirSecundario = true;
                                                // Como la compra se realiza correctamente, se imprime el ticket y se guarda en una lista
                                                // entonces si se quiere realizar otra compra despues de esta 
                                                // elimino los productos del carrito
                                                listaProductosSeleccionados.clear();
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Proceso de compra fallido");
                                            }

                                        }
                                        case 1 -> { // Cuando escoge la opción de no comprar
                                            listaProductosSeleccionados.clear();
                                            salirSecundario = true;
                                        }
                                    }

                                }

                            }
                            case 4 -> {
                                // Como se decide cancelar la compra,se elimina está lista
                                listaProductosSeleccionados.clear();
                                salirSecundario = true;
                            }
                        }
                    } while (!salirSecundario);

                }
                case 1 -> { //TIPO ADMINISTRADOR
                    // Se llamarán a los metodos de la clase UtilidadesAdministrador
                    do {
                        String inputPass = "";
                        boolean pass = true;
                        String passw = Contraseñas.generarContraseña();
                        System.out.println("Contraseña Administrador: " + passw);
                        ArrayList<Producto> p = Producto.listaProductos();
                        do {
                            inputPass = JOptionPane.showInputDialog("Introduce la contraseña de administrador: ");
                            if (inputPass == null) {
                                break;
                            }
                            if (passw.equals(inputPass)) {
                                pass = false;
                            } else {
                                System.out.println("Introduce la contraseña de nuevo");
                            }
                        } while (pass);
                        //controlo que si pulsa cancelar en el joption salga
                        if (inputPass == null) {
                            JOptionPane.showMessageDialog(null, "Saliendo al menú principal");
                            break;
                        }
                        do {
                            int opcionAdmin = JOptionPane.showOptionDialog(null, "Opciones de administrador", "Administrador", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                    new Object[]{"Consultar ventas", "Añadir producto", "Borrar Producto", "Modificar producto", "Salir",}, "");
                            switch (opcionAdmin) {
                                case 0 -> {
                                    do {
                                        int opcionVentas = JOptionPane.showOptionDialog(null, "¿Que consulta de la venta quieres realizar?", "Ventas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                                                new Object[]{"Consultar ventas por día", "Consultar ventas por fecha", "Consultar el total de ventas", "Salir"}, "");
                                        switch (opcionVentas) {
                                            case 0 -> {
                                                System.out.println("");
                                                UtilidadesAdmin.consultarVentasPorDia(listaTicketsVentas);
                                                salirSecundario = true;
                                            }
                                            case 1 -> {
                                                UtilidadesAdmin.consultarVentasPorFecha(listaTicketsVentas);
                                                salirSecundario = true;
                                            }
                                            case 2 -> {
                                                UtilidadesAdmin.consultarTodasLasVentas(listaTicketsVentas);
                                                salirSecundario = true;
                                            }
                                            case 3 -> {
                                                //sale al submenu de consultar
                                                subconsulta = true;
                                            }
                                        }
                                    } while (!subconsulta);
                                }
                                case 1 -> {
                                    UtilidadesAdmin.añadirProducto(listaProductos);
                                }
                                case 2 -> {
                                    int id = 0;
                                    do {
                                        try {
                                            String input = JOptionPane.showInputDialog("Introduce el ID del producto que desea borrar" + "\n" + UtilidadesAdmin.mostrarLista(listaProductos));
                                            // Si el usuario hace clic en "Cancelar" sale
                                            if (input == null) {
                                                System.out.println("Has salido al menú principal");
                                                idvalido = true;
                                                admin = false;
                                            } else {
                                                id = Integer.parseInt(input);
                                                idvalido = true;
                                            }
                                        } catch (NumberFormatException nfe) {
                                            System.out.println("Introduce un número en el ID");
                                        } catch (NullPointerException npe) {
                                            System.out.println("Saliendo al menú");
                                        }
                                    } while (!idvalido);
                                    if (!salirSecundario) {
                                        UtilidadesAdmin.borrarProducto(listaProductos, id);
                                        salirSecundario = true;
                                    }
                                }
                                case 3 -> {
                                    int id = 0;
                                    do {
                                        try {
                                            String input = JOptionPane.showInputDialog("Introduce el ID del producto que desea modificar" + "\n" + UtilidadesAdmin.mostrarLista(listaProductos));
                                            // Si el usuario hace clic en "Cancelar" sale
                                            if (input == null) {
                                                System.out.println("Has salido al menú principal");
                                                idvalido = true;
                                            } else {
                                                id = Integer.parseInt(input);
                                                idvalido = true;
                                            }
                                        } catch (NullPointerException npe) {
                                            System.out.println("Has salido al menu principal");
                                        } catch (NumberFormatException nfe) {
                                            System.out.println("Introduce un número en el ID");
                                        }
                                    } while (!idvalido);
                                    // comprobar que sigue en el bucle y modificar producto 
                                    if (!salirSecundario) {
                                        UtilidadesAdmin.modificarProducto(listaProductos, id);
                                        for (Producto producto : listaProductos) {
                                            if (producto.getID() == id) {
                                                System.out.println(producto);
                                            }
                                        }
                                        salirSecundario = true;
                                        admin = true;
                                    }
                                }
                                case 4 -> {
                                    System.out.println("Has salido a la selección de usuario");
                                    salirSecundario = true;
                                    admin = true;
                                }
                            }
                        } while (!admin);
                    } while (!salirSecundario);
                }
            }
            if (tipoUsuario == 2) {
                salirPrimario = true;
            }
            System.out.println("**********HA_SALIDO_DEL_MENU_SECUNDARIO**********");
        } while (!salirPrimario);
    }

    public static int seleccionarTipoUsuario() {
        /* Dependiendo de lo que el usuario escoga, se realizarán las llamadas a 
           los metodos del usuario o los de administrador  */
        JCheckBox chec = new JCheckBox();
        return JOptionPane.showOptionDialog(null, "+++++ Seleccion el tipo de usuario +++++", "Tipo de Usuarios", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,// null para icono por defecto.
                new Object[]{"Modo Usuario", "Modo Administrador", "Apagar TPV"}, "");
    }

}
