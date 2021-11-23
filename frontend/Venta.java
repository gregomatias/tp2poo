
package frontend;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dominio.*;
import service.*;

public class Venta {
    public void altaDeCliente(ClienteService clienteService, int dni) {

        int finDelCarro = 0;
        double montoMensualFacturado = 0;

        LocalDate fecha = LocalDate.now().plusDays(10);
        LocalDate fecha2 = LocalDate.now().plusDays(1);
        LocalDate fechaMax = LocalDate.MAX;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaDeInstalacion = fecha.format(formatter);
        String fechaDeActivacion = fecha2.format(formatter);
        String fechaDeBaja = fechaMax.format(formatter);

        Parametrizacion parametrizacion = new Parametrizacion();

        parametrizacion.instanciaPlanes();
        parametrizacion.instanciaPromociones();

        System.out.println("CARRITO DE COMPRAS");

        String domicilio = "Marabotto 384 1A";

        Cuenta cuentaNueva = new Cuenta(domicilio);
        Cliente cliente = new Cliente(dni, "matias", "grego", "cf", cuentaNueva);
        clienteService.creaCliente(cliente);

        List<Plan> carritoDeCompras = new ArrayList<Plan>();

        do {// Do de Seleccion familia de productos y PLanes vigentes

            System.out.println("#Carrito de compras#\n");
            System.out.println("Seleccione la familia de productos:\n");

            int familiaDeProducto = Integer.parseInt(System.console().readLine(("1-Internet 2-Movil 3-TV: ")));

            System.out.println("\nPlanes Disponibles:\n");

            parametrizacion.getPlanes().stream().filter((a) -> a.getFamiliaDeProducto() == familiaDeProducto)
                    .forEach((a) -> System.out
                            .println(a.getIdDelPlan() + "-" + a.getNombreDelPlan() + "-" + a.getValorDelPLan()));

            int planSeleccionado = Integer.parseInt(System.console().readLine(("\nElija el Plan: ")));

            System.out.println("\nPromociones Vigentes:\n");

            parametrizacion.getPromociones().stream().filter((a) -> a.getFamiliaDeProducto() == familiaDeProducto)
                    .forEach((a) -> System.out.println(a.getIdPromocion() + "-" + a.getNombrePromocion()));

            int promocionSeleccionada = Integer.parseInt(System.console().readLine(("\nElija la Promocion: ")));

            switch (familiaDeProducto) {
            case 1:
                ProductoInternet productoInternet = new ProductoInternet(fechaDeInstalacion, fechaDeBaja);

                for (Plan plan : parametrizacion.getPlanes()) {
                    if (plan.getIdDelPlan() == planSeleccionado) {

                        productoInternet.setPlan(plan);
                        cuentaNueva.setProductosInternet(productoInternet);

                        carritoDeCompras.add(plan);

                    }
                }
                for (Promocion promocion : parametrizacion.getPromociones()) {

                    if (promocion.getIdPromocion() == promocionSeleccionada) {

                        productoInternet.setPromocion(promocion);

                    }
                }

                break;
            case 2:

                int idLinea = clienteService.creaIdLinea();
                ProductoMovil productoMovil = new ProductoMovil(idLinea, fechaDeActivacion);
                for (Plan plan : parametrizacion.getPlanes()) {

                    cuentaNueva.setProductosMovil(productoMovil);
                    if (plan.getIdDelPlan() == planSeleccionado) {

                        productoMovil.setPlan(plan);
                        carritoDeCompras.add(plan);

                    }
                }
                for (Promocion promocion : parametrizacion.getPromociones()) {

                    if (promocion.getIdPromocion() == promocionSeleccionada) {

                        productoMovil.setPromocion(promocion);

                    }
                }
                break;

            case 3:
                ProductoTv productoTv = new ProductoTv(fechaDeInstalacion, fechaDeBaja);
                cuentaNueva.setProductosTv(productoTv);
                for (Plan plan : parametrizacion.getPlanes()) {

                    if (plan.getIdDelPlan() == planSeleccionado) {

                        productoTv.setPlan(plan);
                        carritoDeCompras.add(plan);

                    }
                }
                for (Promocion promocion : parametrizacion.getPromociones()) {

                    if (promocion.getIdPromocion() == promocionSeleccionada) {

                        productoTv.setPromocion(promocion);

                    }
                }
                break;

            default:
                System.out.println("Familia de Producto Erronea");
                break;
            }

            finDelCarro = Integer
                    .parseInt(System.console().readLine(("\n¿Finalizó la compra? 1-Sì 0-Seguir Comprando\n")));

        } while (finDelCarro == 0);

        System.out.println("Los planes elegidos son:");

        for (Plan plan : carritoDeCompras) {
            System.out.println(plan.getIdDelPlan() + " " + plan.getNombreDelPlan() + " " + plan.getValorDelPLan());
            montoMensualFacturado = montoMensualFacturado + plan.getValorDelPLan();

        }

        System.out.println("El abono mensual facturado sera de:\n");
        System.out.println(montoMensualFacturado);
    }

}
