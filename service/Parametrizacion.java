package service;

import java.util.ArrayList;
import java.util.List;

import dominio.EventoTelevisivo;
import dominio.Plan;
import dominio.Promocion;

public class Parametrizacion {

    private List<Plan> planes;
    private List<Promocion> promociones;
    private List<EventoTelevisivo> eventosTelevisivos;

    public Parametrizacion() {

        planes = new ArrayList<Plan>();
        promociones = new ArrayList<Promocion>();
        eventosTelevisivos = new ArrayList<EventoTelevisivo>();

    }


    public void instanciaPlanes() {

        planes.add(new Plan(1001, "Fibertel 100MB", 500, 1));
        planes.add(new Plan(1002, "Fibertel 10MB", 300, 1));
        planes.add(new Plan(1003, "Fibertel 50MB", 1000, 1));
        planes.add(new Plan(2001, "Black 20MB", 400, 2));
        planes.add(new Plan(2002, "Black 10MB", 200, 2));
        planes.add(new Plan(2003, "Black 30MB", 800, 2));
        planes.add(new Plan(3001, "Flow Basico", 700, 3));
        planes.add(new Plan(3002, "Flow Premium", 900, 3));

    }

    public void instanciaPromociones() {

        promociones.add(new Promocion(5001, "Fiber 12 meses 10% Descuento", 0.90, 1));
        promociones.add(new Promocion(5002, "Fiber 6 meses 20% Descuento", 0.80, 1));
        promociones.add(new Promocion(6001, "Movil 12 meses 15% Descuento", 0.85, 2));
        promociones.add(new Promocion(6002, "Movil 6 meses 30% Descuento", 0.70, 2));
        promociones.add(new Promocion(7001, "Flow 1 mes sin Cargo", 0, 3));
        promociones.add(new Promocion(7002, "Flow 2 meses 50% Desc", 0.50, 3));

    }
    public void instanciaEventosTelevisisvos() {

        eventosTelevisivos.add(new EventoTelevisivo(8001, "River vs Boca", "futbol"));
        eventosTelevisivos.add(new EventoTelevisivo(8002, "Matrix", "Ciencia Ficcion"));
        eventosTelevisivos.add(new EventoTelevisivo(8003, "El exorcista", "terror"));
        eventosTelevisivos.add(new EventoTelevisivo(8004, "El bueno, el malo y el feo", "Cow Boys"));

    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }
    public List<EventoTelevisivo> getEventosTelevisivos() {
        return eventosTelevisivos;
    }

}
