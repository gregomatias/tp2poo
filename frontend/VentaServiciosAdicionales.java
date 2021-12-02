package frontend;

import dominio.Cliente;
import dominio.EventoTelevisivo;
import service.Parametrizacion;

public class VentaServiciosAdicionales {

    public void activaServiciosAdicionales(Cliente cliente) {
        Parametrizacion parametrizacion = new Parametrizacion();
        parametrizacion.instanciaEventosTelevisisvos();
        System.out.println("\n##Elige el servicio a vender:##");
        System.out.println("1-Eventos Televisivos  3-Salir del Carro de Compras");

        int servicio = Integer.parseInt(System.console().readLine(("Ingrese una opción: ")));

        while (servicio != 3) {
            switch (servicio) {
                case 1:
                    if (!cliente.getCuenta().getProductosTv().isEmpty()) {
                        System.out.println("\n##Eventos televisivos Disponibles##");
                        for (EventoTelevisivo evento : parametrizacion.getEventosTelevisivos()) {
                            System.out.println(evento.getIdEvento() + " " + evento.getNombreEvento());
                        }
                        int evento = Integer.parseInt(System.console().readLine(("Ingrese el evento:")));

                        if (!parametrizacion.getEventosTelevisivos().stream().filter((e) -> e.getIdEvento() == evento)
                                .findFirst().isEmpty()) {
                            System.out.println("\nAprovisionamiento: El evento fue activado con exito");
                        } else {
                            System.out.println("El id de evento no existe");
                        }

                    } else {
                        System.out.println("Error:La cuenta no tiene productos de TV!!!\n");
                    }

                    break;
                case 2:
                    break;

                    //Para el final--2- Protección Personal

                default:
                    break;
            }
            System.out.println("\n##Elige el servicio a vender:##");
            System.out.println("1-Eventos Televisivos 2- Seguro Protección Movil 3-Salir del Carro de Compras");

            servicio = Integer.parseInt(System.console().readLine(("Ingrese una opción: ")));

        }

    }

}
