package frontend;

import dominio.Cliente;
import dominio.Cuenta;
import dominio.ProductoInternet;
import dominio.ProductoMovil;
import dominio.ProductoTv;
import service.ClienteService;

public class AtencionAlCliente {

    public void atiendeCliente(ClienteService clienteService, int dni) {
        Cliente cliente = new Cliente(0, null, null, null);

        // int dni = 26200854;
        if (clienteService.getClientes().stream().filter((c) -> c.getDni() == dni).findFirst().isEmpty()) {

            System.out.println("El cliente No existe");
        } else {

            cliente = clienteService.getClientes().stream().filter((c) -> c.getDni() == dni).findFirst().get();

            for (Cuenta cuenta : cliente.getCuentas()) {
                System.out.println("\nDomicilio de Facturacion:\n" + cuenta.getDomicilio());
                for (ProductoInternet productoInternet : cuenta.getProductosInternet()) {
                    System.out.println("############Productos de internet############\n");
                    System.out.println("Fecha Instalacion|Pan Adquirido|Fecha de Baja");

                    System.out.println("   " + productoInternet.getFechaDeInstalacion() + "    |"
                            + productoInternet.getPlan().getNombreDelPlan() + "|" + productoInternet.getFechaDeBaja());

                }
                for (ProductoMovil productoMovil : cuenta.getProductosMovil()) {
                    System.out.println("\n############Productos Movil############\n");
                    System.out.println("Fecha Activacion|Pan Adquirido|ID Linea");

                    System.out.println("   " + productoMovil.getFechaActivacion() + "    |"
                            + productoMovil.getPlan().getNombreDelPlan() + "|" + productoMovil.getIdLinea());

                }
                for (ProductoTv productoTv : cuenta.getProductosTv()) {
                    System.out.println("\n############Productos Tv############\n");
                    System.out.println("Fecha Instalacion|Pan Adquirido|Fecha de baja");

                    System.out.println("   " + productoTv.getFechaDeInstalacion() + "    |"
                            + productoTv.getPlan().getNombreDelPlan() + "|" + productoTv.getFechaDebaja());

                }
            }

        }

        // Aqui iria el dni de busqueda de cliente activo JOPTIONPANE

    }

}
