package frontend;

import dominio.Cliente;
import dominio.ProductoInternet;
import dominio.ProductoMovil;
import dominio.ProductoTv;
import service.ClienteService;

public class AtencionAlCliente {

    public void atiendeCliente(ClienteService clienteService, int dni) {
        VentaServiciosAdicionales ventaServiciosAdicionales = new VentaServiciosAdicionales();

        // int dni = 26200854;
        if (clienteService.getClientes().stream().filter((c) -> c.getDni() == dni).findFirst().isEmpty()) {

            System.out.println("El cliente No existe");
        } else {

            Cliente cliente = clienteService.getClientes().stream().filter((c) -> c.getDni() == dni).findFirst().get();
            System.out.println("######Modulo de Atención al Cliente######");
            System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());

            // for (Cuenta cuenta : cliente.getCuentas()) {
            System.out.println("Domicilio de Facturacion:" + cliente.getCuenta().getDomicilio());
            for (ProductoInternet productoInternet : cliente.getCuenta().getProductosInternet()) {
                System.out.println("\n------------Productos de internet------------");
                System.out.println("Fecha Instalacion|Pan Adquirido| Fecha de Baja  |         Promoción          ");

                System.out.println("   " + productoInternet.getFechaDeInstalacion() + "    |"
                        + productoInternet.getPlan().getNombreDelPlan() + "|" + productoInternet.getFechaDeBaja()
                        + "|" + productoInternet.getPromocion().getNombrePromocion());

            }
            for (ProductoMovil productoMovil : cliente.getCuenta().getProductosMovil()) {
                System.out.println("\n------------Productos Movil------------");
                System.out.println("Fecha Activacion|Pan Adquirido|ID Linea|         Promoción          ");

                System.out.println("   " + productoMovil.getFechaActivacion() + "    |"
                        + productoMovil.getPlan().getNombreDelPlan() + "|" + productoMovil.getIdLinea() + "|"
                        + productoMovil.getPromocion().getNombrePromocion());

            }
            for (ProductoTv productoTv : cliente.getCuenta().getProductosTv()) {
                System.out.println("\n------------Productos Tv------------");
                System.out.println("Fecha Instalacion|Pan Adquirido|Fecha de baja |         Promoción          ");

                System.out.println("   " + productoTv.getFechaDeInstalacion() + "    |"
                        + productoTv.getPlan().getNombreDelPlan() + "|" + productoTv.getFechaDebaja() + "|"
                        + productoTv.getPromocion().getNombrePromocion());

            }

            System.out.println("\n######Venta de Servicios Adicionales######");
            System.out.println("1-Modulo Venta de servicios 2-Salir del cliente");
            int servicio = Integer.parseInt(System.console().readLine(("Ingrese una opción: ")));
            if (servicio == 1) {
                ventaServiciosAdicionales.activaServiciosAdicionales(cliente);
            }

        }

    }

}
