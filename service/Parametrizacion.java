package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Plan;
import dominio.Promocion;

public class Parametrizacion {

    private List<Plan> planes;
    private List<Promocion> promociones;

    public Parametrizacion() {
        planes = new ArrayList<Plan>();
        promociones = new ArrayList<Promocion>();

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

        promociones.add(new Promocion(5001, "Fiber 12 meses 10% Descuento", -0.10, 1));
        promociones.add(new Promocion(5002, "Fiber 6 meses 20% Descuento", -0.20, 1));
        promociones.add(new Promocion(6001, "Movil 12 meses 15% Descuento", -0.15, 2));
        promociones.add(new Promocion(6002, "Movil 6 meses 30% Descuento", -0.30, 2));
        promociones.add(new Promocion(7001, "Flow 1 mes sin Cargo", -100, 3));
        promociones.add(new Promocion(7002, "Flow 2 meses 50% Desc", -0.50, 3));

    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

}
