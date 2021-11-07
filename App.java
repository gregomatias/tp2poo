
import configuracion.*;
import derivada.PlanAdquirido;
import base.*;

public class App {
    public static void main(String[] args) throws Exception {

        int finDelCarro = 0;

        Configuracion configuracion = new Configuracion();
        PlanAdquirido miPlan = new PlanAdquirido();

        configuracion.instanciaPlanes();

        do {

            System.out.println("Carrito de compras:\n");

            int familiaDeProducto = Integer.parseInt(System.console().readLine(("1-Internet 2-Movil 3-TV \n")));

            System.out.println("Planes Disponibles:\n");
            configuracion.planesDisponibles(familiaDeProducto);

            int planSeleccionado = Integer.parseInt(System.console().readLine(("\nElija el Plan: ")));

            switch (familiaDeProducto) {
            case 1:
                miPlan.setIdPlanInternet(planSeleccionado);
                break;
            case 2:
                miPlan.setIdPlanMovil(planSeleccionado);
                break;
            case 3:
                miPlan.setIdPlanTv(planSeleccionado);
                break;

            default:
                System.out.println("Familia de Producto Erronea");
                break;
            }

            finDelCarro = Integer.parseInt(System.console().readLine(("\n¿Finalizó la compra? 1-Sì 0-Seguir Comprando\n")));

        } while (finDelCarro == 0);

   System.out.println(miPlan.getIdPlanInternet());     
   System.out.println(miPlan.getIdPlanMovil()); 
   System.out.println(miPlan.getIdPlanTv()); 

    }// Fin Main
}// Fin Clase APP
