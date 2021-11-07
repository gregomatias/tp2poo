package derivada;
import base.Plan;

public class PlanInternet extends Plan {



    public PlanInternet (int idDelPlan,String nombreDelPLan,double valorDelPLan){
        super(idDelPlan,nombreDelPLan,valorDelPLan);

    }

    @Override
    public String getNombreDelPLan() {
        return  super.nombreDelPlan;
    }

    @Override
    public double getValorDelPlan() {
        return  super.valorDelPLan;
    }

    @Override
    public int getIdDelPlan() {
        return  super.idDelPlan;
    }


    
}
