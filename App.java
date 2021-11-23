import java.util.Scanner;

import frontend.AtencionAlCliente;
import frontend.Venta;
import service.ClienteService;

public class App {
    public static void main(String[] args) {
        Venta venta = new Venta();
        AtencionAlCliente atencionaAlCliente = new AtencionAlCliente();
        ClienteService clienteService = new ClienteService();
        Scanner scanner = new Scanner(System.in);
        int elUsuarioEstaLogueado = 0;

        while (elUsuarioEstaLogueado == 0) {

            int dni = Integer.parseInt(System.console().readLine(("Ingrese el Dni del cliente:\n")));

            if (clienteService.getClientes().stream().filter((c) -> c.getDni() == dni).findFirst().isEmpty()) {

                venta.altaDeCliente(clienteService, dni);

            } else {
                atencionaAlCliente.atiendeCliente(clienteService, dni);
            }
            System.out.println("Desea desloguear? Sí:1 No:0");
            elUsuarioEstaLogueado = scanner.nextInt();

        }

    }
}
