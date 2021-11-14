package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Plan;

public class PlanService {

    private List<Plan> planes;


    public PlanService() {
        planes = new ArrayList<Plan>();

    }

    public void instanciaPlanes() {

        planes.add(new Plan(1001, "Fibertel 100MB", 500,1));
        planes.add(new Plan(1002, "Fibertel 10MB", 300,1));
        planes.add(new Plan(1003, "Fibertel 50MB", 1000,1));
        planes.add(new Plan(2001, "Black 20MB", 400,2));
        planes.add(new Plan(2002, "Black 10MB", 200,2));
        planes.add(new Plan(2003, "Black 30MB", 800,2));
        planes.add(new Plan(3001, "Flow Basico",700,3));
        planes.add(new Plan(3002, "Flow Premium",900,3));
    }


        


        

     // Fin Planes Disonibles

    public List<Plan> getPlanes() {
        return planes;
    }


}
