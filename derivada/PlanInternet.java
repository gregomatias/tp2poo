package derivada;
import base.Plan;

public class PlanInternet extends Plan {



    public PlanInternet (String nombreDelPLan,double valorDelPLan){
        this.nombreDelPLan=nombreDelPLan;
        this.valorDelPLan=valorDelPLan;

    }

    @Override
    public String getNombreDelPLan() {
        return nombreDelPLan;
    }

    @Override
    public double getValorDelPLan() {
        return valorDelPLan;
    }


    
}
