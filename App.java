
import configuracion.*;

public class App {
    public static void main(String[] args) throws Exception {

        Configuracion configuracion = new Configuracion();

        configuracion.instanciaPlanes();

        System.out.println("Carrito de compras: ");

        int familiaDeProducto = Integer.parseInt(System.console().readLine(("1-Internet 2-Movil 3-TV \n")));

        configuracion.planesDisponibles(familiaDeProducto);

    }// Fin Main
}// Fin Clase APP
