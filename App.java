import java.util.Scanner;

import dominio.Cliente;
import dominio.Cuenta;
import frontend.AtencionAlCliente;
import frontend.Venta;
import service.ClienteService;
import service.UsuarioService;

public class App {
    public static void main(String[] args) {
        String nombreUsuario = "";
        String claveUsuario = "";
        int elUsuarioEstaLogueado = 1;
        int cuentaIntentosDeLogueo = 0;
        Venta venta = new Venta();
        AtencionAlCliente atencionaAlCliente = new AtencionAlCliente();
        ClienteService clienteService = new ClienteService();
        Scanner scanner = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();
        usuarioService.instanciaUsuarios();

        do {

            System.out.println("Ingrese el nombre de Usuario:");
            nombreUsuario = scanner.next();
            System.out.println("Ingrese la clave:");
            claveUsuario = scanner.next();

            if (usuarioService.validaUsuario(nombreUsuario, claveUsuario)) {
                System.out.println("Bienvenido " + nombreUsuario);
                elUsuarioEstaLogueado = 0;

            } else {
                System.out.println("Datos incorrectos");
                cuentaIntentosDeLogueo = cuentaIntentosDeLogueo + 1;
                if (cuentaIntentosDeLogueo > 2) {
                    System.out.println("Excedió el número de intentos, contacte a un administrador");
                }
            }

        } while (elUsuarioEstaLogueado != 0 && cuentaIntentosDeLogueo < 3);

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
