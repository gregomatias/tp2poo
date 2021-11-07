
import configuracion.*;

public class App {
    public static void main(String[] args) throws Exception {

        Configuracion configuracion = new Configuracion();

        configuracion.instanciaPlanes();

        System.out.println("Carrito de compras:\n");

        int familiaDeProducto = Integer.parseInt(System.console().readLine(("1-Internet 2-Movil 3-TV \n")));

        System.out.println("Planes Disponibles:\n");
        configuracion.planesDisponibles(familiaDeProducto);

        int planSeleccionado = Integer.parseInt(System.console().readLine(("\nElija el Plan: ")));

        



    }// Fin Main
}// Fin Clase APP
