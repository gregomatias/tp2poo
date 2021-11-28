package frontend;

import java.util.Optional;

import dominio.Cliente;
import dominio.Cuenta;
import dominio.EventoTelevisivo;
import service.ClienteService;
import service.Parametrizacion;

public class VentaServiciosAdicionales {

    public void activaServiciosAdicionales(Cliente cliente) {
        Parametrizacion parametrizacion = new Parametrizacion();
        parametrizacion.instanciaEventosTelevisisvos();
        ClienteService clienteService = new ClienteService();

        System.out.println("Ingrese el domicilio donde quiere activar el servicio: ");

        String domicilio = System.console().readLine("Ingrese una opción: ");

        Cuenta cuenta = clienteService.devuelveCuenta(cliente, domicilio);
        Optional optional = Optional.ofNullable(cuenta);

        while (!optional.isPresent()) {
            System.out.println("Domicilio Invalido. Ingrese el domicilio: ");
            domicilio = System.console().readLine("Ingrese una opción: ");

            cuenta = clienteService.devuelveCuenta(cliente, domicilio);
            optional = Optional.ofNullable(cuenta);
        }

        System.out.println("1-Eventos Televisivos 2- Protección Personal 3-Salir del Carro de Compras");

        int servicio = Integer.parseInt(System.console().readLine(("Ingrese una opción: ")));

        while (servicio != 3) {
            switch (servicio) {
            case 1:
                if (!cuenta.getProductosTv().isEmpty()) {
                    System.out.println("\n##Eventos televisivos Disponibles##");
                    for (EventoTelevisivo evento : parametrizacion.getEventosTelevisivos()) {
                        System.out.println(evento.getIdPelicula() + " " + evento.getNombrePelicula());
                    }
                    int evento = Integer.parseInt(System.console().readLine(("Ingrese el evento:")));

                    if (!parametrizacion.getEventosTelevisivos().stream().filter((e) -> e.getIdPelicula() == evento)
                            .findFirst().isEmpty()) {
                        System.out.println("Aprovisionamiento: El evento fue activado con exito");
                    } else {
                        System.out.println("El id de evento no existe");
                    }

                } else {
                    System.out.println("La cuenta no tiene productos de TV");
                }

                break;
            case 2:
                break;

            default:
                break;
            }
            System.out.println("1-Eventos Televisivos 2- Protección Personal 3-Salir del Carro de Compras");

            servicio = Integer.parseInt(System.console().readLine(("Ingrese una opción: ")));

        }

    }

}
