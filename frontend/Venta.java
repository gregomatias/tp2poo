
package frontend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dominio.*;
import service.*;

public class Venta {
    public void altaDeCliente(ClienteService clienteService, int dni) {

        int finDelCarro = 0;

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

        System.out.println("######Cliente Nuevo: CARRITO DE COMPRAS#####");

        String nombreDelTitular = System.console().readLine(("Ingresar Nombre del Titular: "));
        String apellidoDelTitular = System.console().readLine(("Ingresar Apellido del titular: "));
        String domicilio = System.console().readLine(("Ingresar Domicilio de instalacion: "));

        Cuenta cuentaNueva = new Cuenta(domicilio);

        Cliente cliente = new Cliente(dni, nombreDelTitular, apellidoDelTitular, cuentaNueva);
        clienteService.creaCliente(cliente);

        do {// Do de Seleccion familia de productos y PLanes vigentes

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

            int promocionSeleccionada = Integer.parseInt(System.console().readLine(("\nElija la Promoción: ")));

            switch (familiaDeProducto) {
            case 1:
                ProductoInternet productoInternet = new ProductoInternet(fechaDeInstalacion, fechaDeBaja);

                for (Plan plan : parametrizacion.getPlanes()) {
                    if (plan.getIdDelPlan() == planSeleccionado) {

                        productoInternet.setPlan(plan);
                        cuentaNueva.setProductosInternet(productoInternet);

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
                cuentaNueva.setProductosMovil(productoMovil);
                for (Plan plan : parametrizacion.getPlanes()) {

                    if (plan.getIdDelPlan() == planSeleccionado) {

                        productoMovil.setPlan(plan);

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
                    .parseInt(System.console().readLine(("\n¿Finalizó la compra? Sí: 1 Seguir Comprando: 0\n")));

        } while (finDelCarro == 0);

        System.out.println("\n##########Fin del Carro. Productos comprados:##########\n");

        if (!cuentaNueva.getProductosInternet().isEmpty()) {
            System.out.println("Planes de INTERNET:");
            for (ProductoInternet productoInternet : cuentaNueva.getProductosInternet()) {
                System.out.println(
                        productoInternet.getPlan().getIdDelPlan() + " " + productoInternet.getPlan().getNombreDelPlan()
                                + " $" + productoInternet.getPlan().getValorDelPLan());
                System.out.println("Promocion: " + productoInternet.getPromocion().getNombrePromocion());
                System.out.println("Valor con descuento: $" + productoInternet.getPlan().getValorDelPLan()
                        * productoInternet.getPromocion().getPorcentajeDescuento() + "\n");
            }
        }
        if (!cuentaNueva.getProductosMovil().isEmpty()) {
            System.out.println("Planes MOVIL:");
            for (ProductoMovil productomovil : cuentaNueva.getProductosMovil()) {
                System.out.println(
                        productomovil.getPlan().getIdDelPlan() + " " + productomovil.getPlan().getNombreDelPlan() + " $"
                                + productomovil.getPlan().getValorDelPLan());
                System.out.println("Promocion: " + productomovil.getPromocion().getNombrePromocion());
                System.out.println("Valor con descuento: $" + productomovil.getPlan().getValorDelPLan()
                        * productomovil.getPromocion().getPorcentajeDescuento() + "\n");
            }
        }
        if (!cuentaNueva.getProductosTv().isEmpty()) {
            System.out.println("Planes TV POR CABLE:");
            for (ProductoTv productoTv : cuentaNueva.getProductosTv()) {
                System.out.println(productoTv.getPlan().getIdDelPlan() + " " + productoTv.getPlan().getNombreDelPlan()
                        + " $" + productoTv.getPlan().getValorDelPLan());
                System.out.println("Promocion: " + productoTv.getPromocion().getNombrePromocion());
                System.out.println("Valor con descuento: $"
                        + productoTv.getPlan().getValorDelPLan() * productoTv.getPromocion().getPorcentajeDescuento()
                        + "\n");
            }
        }

    }

}
