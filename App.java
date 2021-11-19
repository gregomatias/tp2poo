
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
        ProductoInternetService productoInternetService = new ProductoInternetService();
        ProductoMovilService productoMovilService = new ProductoMovilService();
        ProductoTvService productoTvService = new ProductoTvService();
        CuentaService cuentaService = new CuentaService();
        PlanService planService = new PlanService();

        planService.instanciaPlanes();

        int dni = 26200854;
        String domicilio = "Marabotto 384 1A";

        clienteService.creaCliente(26200854, "matias", "grego", "cf");

        cuentaService.creaCuenta(domicilio, dni);
        int esClienteNuevo = 1;



        switch (esClienteNuevo) {
            case 1:
                
                break;

                case 2:
                
                break;
        
            default:
            System.out.println("Dato incorrecto");
                break;
        }

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

                            productoInternetService.creaProductointernet(fechaDeInstalacion, fechaDeBaja,
                                    cuentaService.getCuentas().size(), plan);
                            carritoDeCompras.add(plan);

                        }
                    }
                    break;
                case 2:
                    for (Plan plan : planService.getPlanes()) {

                        if (plan.getIdDelPlan() == planSeleccionado) {

                            int idLinea = productoMovilService.creaIdLinea();
                            productoMovilService.creaProductoMovil(idLinea, fechaDeActivacion,
                                    cuentaService.getCuentas().size(), plan);
                            carritoDeCompras.add(plan);

                        }
                    }
                    break;

                case 3:
                    for (Plan plan : planService.getPlanes()) {

                        if (plan.getIdDelPlan() == planSeleccionado) {

                            productoTvService.creaProductoTv(fechaDeInstalacion, fechaDeBaja,
                                    cuentaService.getCuentas().size(), plan);
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

        for (Cuenta cuenta : cuentaService.getCuentas()) {
            if (cuenta.getDniPropietario() == dni)
                for (ProductoInternet productoInternet : productoInternetService.getProductosDeInternet()) {
                    if (productoInternet.getIdCuentaPropietaria() == cuenta.getIdCuenta()) {
                        System.out.println("Id Producto: " + productoInternet.getIdProducto());
                        System.out.println(" Fecha Instalacion: " + productoInternet.getFechaDeInstalacion());
                        System.out.println(" Cuenta Padre: " + productoInternet.getIdCuentaPropietaria());
                        System.out.println("Plan: " + productoInternet.getPlan().getNombreDelPlan());
                    }

                }

        }

        for (Cuenta cuenta : cuentaService.getCuentas()) {
            if (cuenta.getDniPropietario() == dni)
                for (ProductoTv productoTv : productoTvService.getProductosTv()) {
                    if (productoTv.getIdCuentaPropietaria() == cuenta.getIdCuenta()) {
                        System.out.println("Id Producto: " + productoTv.getIdProducto());
                        System.out.println(" Fecha Instalacion: " + productoTv.getFechaDeInstalacion());
                        System.out.println(" Cuenta Padre: " + productoTv.getIdCuentaPropietaria());
                        System.out.println("Plan: " + productoTv.getPlan().getNombreDelPlan());
                    }

                }

        }

        for (Cuenta cuenta : cuentaService.getCuentas()) {
            if (cuenta.getDniPropietario() == dni)
                for (ProductoMovil productoMovil : productoMovilService.getProductosMovil()) {
                    if (productoMovil.getIdCuentaPropietaria() == cuenta.getIdCuenta()) {
                        System.out.println("Id Producto: " + productoMovil.getIdProducto());
                        System.out.println("Id Linea: " + productoMovil.getIdLinea());
                        System.out.println(" Fecha Activacion: " + productoMovil.getFechaActivacion());
                        System.out.println(" Cuenta Padre: " + productoMovil.getIdCuentaPropietaria());
                        System.out.println("Plan: " + productoMovil.getPlan().getNombreDelPlan());
                    }

                }

        }

    }// Fin Main
}// Fin Clase APP
