
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dominio.*;
import service.*;

public class App {
    public static void main(String[] args) throws Exception {

        int finDelCarro = 0;
        int finalizaLaCompra = 0;
        double montoMensualFacturado = 0;

        LocalDate fecha = LocalDate.now().plusDays(10);
        LocalDate fecha2 = LocalDate.now().plusDays(1);
        LocalDate fechaMax = LocalDate.MAX;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaDeInstalacion = fecha.format(formatter);
        String fechaDeActivacion = fecha2.format(formatter);
        String fechaDeBaja = fechaMax.format(formatter);

        List<Plan> carritoDeCompras = new ArrayList<Plan>();

        ClienteService clienteService = new ClienteService();
  
        PlanService planService = new PlanService();

        planService.instanciaPlanes();

        int dni = 26200854;
        String domicilio = "Marabotto 384 1A";

        Cuenta cuentaNueva = new Cuenta(domicilio);
        Cliente cliente = new Cliente(26200854, "matias", "grego", "cf", cuentaNueva);

       // int esClienteNuevo = 1;



        do {

            do {// Do de Seleccion familia de productos y PLanes vigentes

                System.out.println("#Carrito de compras#\n");
                System.out.println("Seleccione la familia de productos:\n");

                int familiaDeProducto = Integer.parseInt(System.console().readLine(("1-Internet 2-Movil 3-TV: ")));

                System.out.println("Planes Disponibles:\n");

                planService.getPlanes().stream().filter((a) -> a.getFamiliaDeProducto() == familiaDeProducto)
                        .forEach((a) -> System.out
                                .println(a.getIdDelPlan() + "-" + a.getNombreDelPlan() + "-" + a.getValorDelPLan()));

                int planSeleccionado = Integer.parseInt(System.console().readLine(("\nElija el Plan: ")));

                switch (familiaDeProducto) {
                case 1:
                    for (Plan plan : planService.getPlanes()) {

                        if (plan.getIdDelPlan() == planSeleccionado) {
                            ProductoInternet productoInternet = new ProductoInternet(fechaDeInstalacion, fechaDeBaja,
                                    plan);
                            cliente.getCuenta(cuentaNueva).setProductosInternet(productoInternet);

                            carritoDeCompras.add(plan);

                        }
                    }
                    break;
                case 2:
                    for (Plan plan : planService.getPlanes()) {

                        if (plan.getIdDelPlan() == planSeleccionado) {

                            int idLinea = clienteService.creaIdLinea();

                            ProductoMovil productoMovil = new ProductoMovil(idLinea, fechaDeActivacion, plan);
                            cliente.getCuenta(cuentaNueva).setProductosMovil(productoMovil);
                            carritoDeCompras.add(plan);

                        }
                    }
                    break;

                case 3:
                    for (Plan plan : planService.getPlanes()) {

                        if (plan.getIdDelPlan() == planSeleccionado) {
                            ProductoTv productoTv = new ProductoTv(fechaDeInstalacion, fechaDeBaja, plan);
                            cliente.getCuenta(cuentaNueva).setProductosTv(productoTv);
                            carritoDeCompras.add(plan);

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

            finalizaLaCompra = Integer.parseInt(System.console().readLine(("\nFinalizar la compra 1-Si 0-No ")));

        } while (finalizaLaCompra == 0);

        // Aqui iria el dni de busqueda de cliente activo JOPTIONPANE
        clienteService.getCliente(dni);

        for (Cuenta cuenta : clienteService.getCliente(dni).getCuentas()) {
            for (ProductoInternet productoInternet : cuenta.getProductosInternet()) {

                System.out.println(productoInternet.getFechaDeInstalacion() + "|" + productoInternet.getPlan() + "|"
                        + productoInternet.getFechaDeBaja());

            }
            for (ProductoMovil productoMovil : cuenta.getProductosMovil()) {

                System.out.println(productoMovil.getFechaActivacion() + "|" + productoMovil.getPlan() + "|"
                        + productoMovil.getIdLinea());

            }
            for (ProductoTv productoTv : cuenta.getProductosTv()) {

                System.out.println(productoTv.getFechaDeInstalacion() + "|" + productoTv.getPlan() + "|"
                        + productoTv.getFechaDebaja());

            }
        }

    }// Fin Main
}// Fin Clase APP
