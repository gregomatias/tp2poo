import frontend.AtencionAlCliente;
import frontend.Venta;
import service.ClienteService;

public class App {
    public static void main(String[] args) {
        Venta venta = new Venta();
        AtencionAlCliente atencionaAlCliente = new AtencionAlCliente();
        ClienteService clienteService = new ClienteService();

        int esClienteNuevo = Integer
                .parseInt(System.console().readLine(("Cliente Nuevo: 1 Cliente Existente: 0\n")));



 
            if (esClienteNuevo==1) {
                venta.altaDeCliente(clienteService);
            } else{

                atencionaAlCliente.atiendeCliente(clienteService);
            }
            


            
        

    }
}
